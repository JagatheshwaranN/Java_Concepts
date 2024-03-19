package preparation.revise.has_a;

import java.util.ArrayList;
import java.util.List;

public class AggregationDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Basics of Java Programming");
        Book book2 = new Book("Data Structures and Algorithms");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
    }
}

class Book {

    private final String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

class Library {

    private final List<Book> bookList;

    public Library(){
        bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in Library..");
        bookList.forEach(b -> System.out.println(b.getTitle()));
    }
}