package repository;

import controller.ConnectManager;
import model.*;
import utils.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CheckoutRecordRepository {
    private Connection connection;

    public int getNextId() throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select max(id) as id from checkout_record_entry");
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            return 1;

        return rs.getInt("id") + 1;
    }

    public boolean checkout(CheckoutRecordEntry recordEntry, int memberId) throws SQLException {
        connection = ConnectManager.getConnection();
        String query = String.format("insert into checkout_record_entry (id, book_copy_num, checkout_date, due_date)\n" +
                "values ('%s','%s','%s','%s');", recordEntry.getId(), recordEntry.getBookCopy().getCopyNum(), recordEntry.getCheckoutDate(), recordEntry.getDueDate());
        PreparedStatement stat = connection.prepareStatement(query);
        int rs = stat.executeUpdate();

        if (rs > 0) {
            insertCheckoutRecord(recordEntry, memberId);
            return true;
        }


        return false;
    }

    private boolean insertCheckoutRecord(CheckoutRecordEntry recordEntry, int memberId) throws SQLException {
        connection = ConnectManager.getConnection();
        String query = String.format("insert into checkout_record (checkout_record_entry_id, member_id)\n" +
                "values ('%s','%s')", recordEntry.getId(), memberId);
        PreparedStatement stat = connection.prepareStatement(query);
        int rs = stat.executeUpdate();

        if (rs > 0) {
            boolean b = updateBookCopy(recordEntry.getBookCopy().getBook().getId(), recordEntry.getBookCopy().getCopyNum(), false);
            if (b) {
                System.out.println("updated book copy status...");
            }
            return true;
        }

        return false;
    }

    private boolean updateBookCopy(int bookId, int copyNum, boolean status) throws SQLException {
        connection = ConnectManager.getConnection();
        String query = String.format("update book_copy set status = '%s' where book_id = '%s' and copy_num = '%s'", status, bookId, copyNum);
        PreparedStatement stat = connection.prepareStatement(query);
        int rs = stat.executeUpdate();

        if (rs > 0)
            return true;

        return false;
    }

    public CheckoutRecord findCheckoutRecord(String isbn, String memberId) throws Exception {
        connection = ConnectManager.getConnection();
        String query = String.format("select *, lm.member_id as lm_id, lm.id as m_id from checkout_record cr\n" +
                "         inner join checkout_record_entry cre on cre.id = cr.checkout_record_entry_id\n" +
                "         inner join book_copy bc on bc.copy_num = cre.book_copy_num\n" +
                "         inner join book b on bc.book_id = b.id\n" +
                "         inner join library_member lm on lm.id = cr.member_id\n" +
                "         where lm.member_id = '%s' and b.isbn = '%s' and bc.status = 'f' and cre.return_date is null limit 1", memberId, isbn);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();
        if (!rs.next())
            throw new Exception("Record not found");

        Book book = new Book(rs.getInt("book_id"),
                rs.getString("isbn"),
                rs.getString("title"),
                rs.getInt("max_checkout_length"),
                null);
        BookCopy bookCopy = new BookCopy(rs.getInt("book_copy_num"), book);
        CheckoutRecordEntry recordEntry = new CheckoutRecordEntry(rs.getInt("checkout_record_entry_id"),
                LocalDate.parse(rs.getString("checkout_date").split(" ")[0]),
                LocalDate.parse(rs.getString("due_date").split(" ")[0]),
                bookCopy);
        LibraryMember member = new LibraryMember(rs.getInt("m_id"),
                rs.getString("lm_id"),
                rs.getString("firstname"),
                rs.getString("lastname"),
                rs.getString("phone"),
                null);
        CheckoutRecord record = new CheckoutRecord(recordEntry, member);
        return record;
    }

    public boolean returnBook(int bookId, int copyNum, int checkoutRecordEntryId) throws Exception {
        connection = ConnectManager.getConnection();
        String query = String.format("update checkout_record_entry set return_date = now() where id = '%s'", checkoutRecordEntryId);
        PreparedStatement stat = connection.prepareStatement(query);
        int rs = stat.executeUpdate();

        if (rs > 0) {
            if (updateBookCopy(bookId, copyNum, true)) {
                return true;
            }
            throw new Exception("Unable to update book status");
        }
        return false;
    }

    public List<CheckoutRecord> getMemberCheckoutRecords(String memberId) throws Exception {
        connection = ConnectManager.getConnection();
        String query = String.format("select *, lm.member_id as lm_id, lm.id as m_id from checkout_record cr\n" +
                "         inner join checkout_record_entry cre on cre.id = cr.checkout_record_entry_id\n" +
                "         inner join book_copy bc on bc.copy_num = cre.book_copy_num\n" +
                "         inner join book b on bc.book_id = b.id\n" +
                "         inner join library_member lm on lm.id = cr.member_id\n" +
                "         where lm.member_id = '%s' order by cre.id", memberId);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        List<CheckoutRecord> list = new ArrayList<>();
        while (rs.next()) {
            System.out.println(rs.getInt("book_copy_num"));
            Book book = new Book(rs.getInt("book_id"),
                    rs.getString("isbn"),
                    rs.getString("title"),
                    rs.getInt("max_checkout_length"),
                    null);
            BookCopy bookCopy = new BookCopy(rs.getInt("book_copy_num"), book);
            CheckoutRecordEntry recordEntry = new CheckoutRecordEntry(rs.getInt("checkout_record_entry_id"),
                    LocalDate.parse(rs.getString("checkout_date").split(" ")[0]),
                    LocalDate.parse(rs.getString("due_date").split(" ")[0]),
                    bookCopy);
            if (rs.getString("return_date") != null)
                recordEntry.setReturnDate(LocalDate.parse(rs.getString("return_date").split(" ")[0]));
            LibraryMember member = new LibraryMember(rs.getInt("m_id"),
                    rs.getString("lm_id"),
                    rs.getString("firstname"),
                    rs.getString("lastname"),
                    rs.getString("phone"),
                    null);
            CheckoutRecord record = new CheckoutRecord(recordEntry, member);

            list.add(record);
        }
        if (list.isEmpty())
            throw new Exception("Record not found");
        System.out.println(list);
        return list;
    }
}
