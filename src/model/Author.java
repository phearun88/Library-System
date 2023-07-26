package model;

import java.util.List;

public class Author extends Person {
    private String credentials;
    private String shortBio;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private List<Book> books;

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public Author(int id, String firstName, String lastName, String phone, Address address, String shortBio) {
        super(id, firstName, lastName, phone, address);
        this.shortBio = shortBio;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

}
