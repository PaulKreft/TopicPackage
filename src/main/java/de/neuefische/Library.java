package de.neuefische;

import java.util.Arrays;

public class Library {
    private String name;
    private Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public void addBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                System.out.println("Book added: " + book.toString());
                return;
            }
        }

        System.out.println("Sorry, library is full...");
    }

    public void deleteBookByTitle(String bookTitle) {
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i] != null && this.books[i].getTitle().equals(bookTitle)) {
                this.books[i] = null;
                System.out.println("Book remove: " + bookTitle);
                return;
            }
        }

        System.out.println("Book not found");
    }

    @Override
    public String toString() {
        return "Library{" + "name='" + name + '\'' + ", books=" + Arrays.toString(books) + '}';
    }
}
