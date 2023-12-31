package org.example;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private final int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Назва: " + title + "\nАвтор: " + author + "\nISBN: " + isbn + "\nРік видання: " + year;
    }
}