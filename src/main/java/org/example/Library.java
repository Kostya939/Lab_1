package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Бібліотека порожня.");
        } else {
            System.out.println("Список книг в бібліотеці:");
            for (Book book : books) {
                System.out.println(book);
                System.out.println("----------------------");
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void removeBookByIsbn(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Книга з ISBN " + isbn + " була видалена з бібліотеки.");
                return;
            }
        }
        System.out.println("Книга з ISBN " + isbn + " не знайдена в бібліотеці.");
    }
}