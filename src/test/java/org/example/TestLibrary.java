package org.example;

import org.example.Book;
import org.example.Library;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestLibrary {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "1234567890", 2022);
        library.addBook(book);

        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testRemoveBookByIsbn() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "1234567890", 2022);
        library.addBook(book);
        library.removeBookByIsbn("1234567890");

        assertFalse(library.getBooks().contains(book));
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "1234567890", 2022);
        library.addBook(book);

        Book foundBook = library.findBookByTitle("Title");
        assertEquals(book, foundBook);
    }
}