package de.neuefische;

import java.util.Arrays;

public class Library {
    private String name;
    private Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" + "name='" + name + '\'' + ", books=" + Arrays.toString(books) + '}';
    }
}
