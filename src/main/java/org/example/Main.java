package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960));
        library.addBook(new Book("1984", "George Orwell", "9780451524935", 1949));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", "9780141439518", 1813));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 1951));


        library.displayBooks();

        Book bookFound = library.findBookByTitle("To Kill a Mockingbird");
        if (bookFound != null) {
            System.out.println("Знайдено книгу: " + bookFound.getTitle());
        } else {
            System.out.println("Книгу не знайдено.");
        }

        library.removeBookByIsbn("9780451524935");

        library.displayBooks();
    }
}