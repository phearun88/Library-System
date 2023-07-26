package controller;

import model.Address;
import model.Author;
import model.Book;
import repository.BookRepository;

import java.sql.SQLException;
import java.util.List;

public class BookController {
    private BookRepository repository;

    public BookController() {
        repository = new BookRepository();
    }

    public boolean addBookCopy(String isbn, int copyNum) throws Exception {
       return repository.addBookCopy(findBook(isbn), copyNum);
   }

   public boolean addBookCopyAuto(String isbn) throws Exception {
        return repository.addBookCopy(findBook(isbn), repository.addUniqueBookCopyNum());
   }

   public Book findBook(String isbn) throws Exception {
        return repository.getBook(isbn);
   }

   public int getNumOfCopy(int bookID) throws Exception {
        return repository.getNumOfCopy(bookID);
   }

   public boolean addAuthor(String firstName, String lastName, String phone, Address add, String bio) throws Exception {
        return repository.addAuthor(firstName,lastName,phone, add, bio);
   }

   public boolean addBook(Book book) throws Exception {
        return repository.addBook(book);
   }

   public List<Author> authorList() throws SQLException {
        return repository.getAuthorList();
   }

   public List<Book> getBookList() throws SQLException {
        return repository.getBookList();
   }
}
