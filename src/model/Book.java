package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private int maxCheckoutLength;
    private List<Author> authors;
    private List<BookCopy> bookCopies;
    public Book(int id, String isbn, String title, int maxCheckoutLength, List<Author> authors) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.maxCheckoutLength = maxCheckoutLength;
        this.authors = authors;
    }

    public Book(int id, String isbn, String title, int maxCheckoutLength) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.maxCheckoutLength = maxCheckoutLength;
        authors = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxCheckoutLength() {
        return maxCheckoutLength;
    }

    public void setMaxCheckoutLength(int maxCheckoutLength) {
        this.maxCheckoutLength = maxCheckoutLength;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<BookCopy> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(List<BookCopy> bookCopies) {
        this.bookCopies = bookCopies;
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", maxCheckoutLength=" + maxCheckoutLength +
                ", authors=" + authors +
                '}';
    }
}
