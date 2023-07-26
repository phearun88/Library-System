package repository;

import controller.ConnectManager;
import model.Address;
import model.Author;
import model.Book;
import model.BookCopy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookRepository {
    private Connection connection;

    public Book getBook(String isbn) throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select * from book where isbn = '%s'", isbn);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            throw new Exception("Book does not exist");

        return new Book(rs.getInt("id"),
                rs.getString("isbn"),
                rs.getString("title"),
                rs.getInt("max_checkout_length"),
                getAuthors(rs.getInt("id")));
    }

    // use id to count the total copy of a specific book
    public int getNumOfCopy(int id) throws SQLException, Exception {
        connection = ConnectManager.getConnection();
//        select count (book_id) from book_copy where book_id=1;
        String query = String.format("select count(book_id) as num from book_copy where book_id='%d'", id);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            throw new Exception("Book does not exist");

        return rs.getInt("num");
    }

    public List<Author> getAuthorList() throws SQLException {
        connection = ConnectManager.getConnection();
        String query = "select * from author";
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();
        return getAuthorList(rs);
    }
    private List<Author> getAuthorList(ResultSet rs) throws SQLException {
        List<Author> authorList = new ArrayList<>();
        int id;
        String firstName;
        String lastName;
        String phone;
        String shortBio;

        while(rs.next()) {
            id = rs.getInt("id");
            firstName = rs.getString("firstname");
            lastName = rs.getString("lastname");
            phone = rs.getString("phone");
            shortBio = rs.getString("short_bio");

            authorList.add(new Author(id, firstName, lastName, phone, null, shortBio));
        }
        return authorList;
    }

    public List<Book> getBookList() throws SQLException {
        connection = ConnectManager.getConnection();
        String query = "select * from book";
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();
        return getBookList(rs);
    }
    private List<Book> getBookList(ResultSet rs) throws SQLException {
        List<Book> list = new ArrayList<>();
        int id;
        String isbn;
        String title;
        int maxCheckoutLength;

        while (rs.next()) {
            id = rs.getInt("id");
            isbn = rs.getString("isbn");
            title = rs.getString("title");
            maxCheckoutLength = rs.getInt("max_checkout_length");

            list.add(new Book(id, isbn, title, maxCheckoutLength, getAuthors(id)));
        }

        return list;
    }


    public BookCopy getAvailableBookCopy(String isbn) throws SQLException, Exception {

        connection = ConnectManager.getConnection();

        Book book = getBook(isbn);

        String query = String.format("select * from book_copy where book_id = '%s' and status = 't' limit 1", book.getId());
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            throw new Exception("This Book is not available to checkout.");

        return new BookCopy(rs.getInt("copy_num"), book);
    }

    public List<Author> getAuthors(int book_id) throws SQLException {
        connection = ConnectManager.getConnection();
        String query = String.format("select * from book_author " +
                "           inner join author a on book_author.author_id = a.id " +
                "           where book_id = %s", book_id);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        List<Author> list = new ArrayList<>();

        while (rs.next()) {
            list.add(new Author(rs.getInt("id"),
                    rs.getString("firstname"),
                    rs.getString("lastname"),
                    rs.getString("phone"),
                    null,
                    rs.getString("short_bio")));
        }

        return list;
    }

    public boolean addBookCopy(Book book, int copyNum) throws Exception {
        connection = ConnectManager.getConnection();
        final String checkQuery = String.format("Select * From book_copy where copy_num='%d'", copyNum);
        final PreparedStatement statCheck = connection.prepareStatement(checkQuery);
        final ResultSet result = statCheck.executeQuery();
        if (result.next())
            throw new Exception("Input Copy_Num Existed. Please Enter a New Number!");

        String query = String.format("INSERT INTO book_copy(copy_num, book_id, status) VALUES(?,?,?)");
        PreparedStatement stat = connection.prepareStatement(query);

        stat.setInt(1, copyNum);
        stat.setInt(2, book.getId());
        stat.setBoolean(3,true);

        int rows = stat.executeUpdate();
        if(rows > 0){
            return true;
        }

        return false;
    }

    public int addUniqueBookCopyNum() throws SQLException {
        connection = ConnectManager.getConnection();

        while(true) {
            Random random = new Random();
            int randomNum = random.nextInt(1000);
            String query = String.format("select copy_num from book_copy where copy_num = %d", randomNum);
            PreparedStatement stat = connection.prepareStatement(query);
            ResultSet rs = stat.executeQuery();
            if (!rs.next()) {
                // copy_num doesn't exist
                return randomNum;
            }
        }
    }

    public boolean addBook(Book book) throws Exception {
        connection = ConnectManager.getConnection();
        String query = String.format("INSERT INTO book VALUES(?,?,?,?)");
        PreparedStatement stat = connection.prepareStatement(query);

        int id = getNextBookId();

        stat.setInt(1, id);
        stat.setString(2, book.getIsbn());
        stat.setString(3, book.getTitle());
        stat.setInt(4, book.getMaxCheckoutLength());

        int rows = stat.executeUpdate();
        if(rows > 0){
            addBookAuthor(id, book.getAuthors().get(0).getId());
            return true;
        }
        return false;
    }

    public boolean addAuthor(String firstName, String lastName, String phone, Address add, String bio) throws Exception {
        connection = ConnectManager.getConnection();
        String query = String.format("INSERT INTO author VALUES(?,?,?,?,?,?,?)");
        PreparedStatement stat = connection.prepareStatement(query);

        stat.setInt(1, getNextAuthorId());
        stat.setString(2, firstName);
        stat.setString(3, lastName);
        stat.setString(4, phone);
        stat.setString(5, null);    // credential
        stat.setInt(6, 0);    // address_id
        stat.setString(7, bio);

        int rows = stat.executeUpdate();
        if(rows > 0){
            return true;
        }
        return false;
    }

    public int getNextBookId() throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select max(id) as id from book");
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            return 1;

        return rs.getInt("id") + 1;
    }

    public int getNextAuthorId() throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select max(id) as id from author");
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            return 1;

        return rs.getInt("id") + 1;
    }

    public boolean addBookAuthor(int bookId, int authorId) throws SQLException {
        connection = ConnectManager.getConnection();
        String query = String.format("INSERT INTO book_author(book_id, author_id) VALUES(?,?)");
        PreparedStatement stat = connection.prepareStatement(query);
        stat.setInt(1, bookId);
        stat.setInt(2, authorId);
        int rows = stat.executeUpdate();
        if(rows > 0){
            return true;
        }
        return false;
    }
}
