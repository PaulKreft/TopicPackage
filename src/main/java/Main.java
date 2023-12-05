import de.neuefische.Book;
import de.neuefische.Library;

public class Main {
    public static void main(String[] args) {
        Book[] favouriteBooks = new Book[5];

        favouriteBooks[0] = new Book("Paul Kreft", "My Java Journey - Revised (buy this one, the other one is shit)", "1");
        favouriteBooks[1] = new Book("Tamana Sherzad", "My Java Journey", "2");
        favouriteBooks[2] = new Book("Vincent Kahl", "Die Leiden des jungen Programmierers", "3");
        favouriteBooks[3] = new Book("Aslon Badridinov", "Meine Erfahrungen mit der Programmiersprache Java", "4");
        favouriteBooks[4] = new Book("Elvedin Turkovic", "How to teach Java perfectly", "5");

        Library alexandria = new Library("Alexandria", favouriteBooks);

        System.out.println(alexandria);
    }
}
