import de.neuefische.Book;
import de.neuefische.Library;

public class Main {
    public static void main(String[] args) {
        Book[] favouriteBooks = new Book[4];

        favouriteBooks[0] = new Book("Tamana Sherzad", "My Java Journey", "2");
        favouriteBooks[1] = new Book("Vincent Kahl", "Die Leiden des jungen Programmierers", "3");
        favouriteBooks[2] = new Book("Aslon Badridinov", "Meine Erfahrungen mit der Programmiersprache Java", "4");
        favouriteBooks[3] = new Book("Elvedin Turkovic", "How to teach Java perfectly", "5");

        Library alexandria = new Library("Alexandria", favouriteBooks);


        Book plagiatedBook = new Book("Paul Kreft", "My Java Journey - Revised (buy this one, the other one is shit)", "1");

        // Initial state of library
        System.out.println("Initial state of library");
        System.out.println(alexandria);
        System.out.println();

        // Should not work, since library is full
        alexandria.addBook(plagiatedBook);
        System.out.println();

        // deleting one book
        alexandria.deleteBookByTitle("How to teach Java perfectly");
        System.out.println();

        // trying to delete the same book again - should print error
        alexandria.deleteBookByTitle("How to teach Java perfectly");
        System.out.println();

        // Adding of new book should work now, since library has a free slot
        alexandria.addBook(plagiatedBook);
        System.out.println();

        // print final state of library
        System.out.println("Final state of library");
        System.out.println(alexandria);
    }
}
