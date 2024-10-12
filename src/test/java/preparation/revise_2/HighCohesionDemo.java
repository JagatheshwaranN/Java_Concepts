package preparation.revise_2;

import java.util.ArrayList;
import java.util.List;

public class HighCohesionDemo {

    public static void main(String[] args) {
        Book book1 = new Book("ABC", "Alexander");
        Book book2 = new Book("XYZ", "Jack");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
    }


}

class Book {

    private String name;
    private String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println(STR."Name: \{name} Author: \{author}");
    }
}

class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks(){
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}