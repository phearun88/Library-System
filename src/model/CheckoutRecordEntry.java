package model;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private int id;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private BookCopy bookCopy;

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public CheckoutRecordEntry(int id, LocalDate checkoutDate, LocalDate dueDate, BookCopy bookCopy) {
        this.id = id;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.bookCopy = bookCopy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    @Override
    public String toString() {
        return "CheckoutRecordEntry{" +
                "id=" + id +
                ", checkoutDate=" + checkoutDate +
                ", dueDate=" + dueDate +
                ", bookCopy=" + bookCopy +
                '}';
    }
}
