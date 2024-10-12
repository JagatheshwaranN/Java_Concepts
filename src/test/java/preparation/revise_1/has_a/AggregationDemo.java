package preparation.revise_1.has_a;

import java.util.ArrayList;
import java.util.List;

public class AggregationDemo {

    public static void main(String[] args) {

        Books book1 = new Books("Basics of Java Programming");
        Books book2 = new Books("Data Structures and Algorithms");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
    }
}

class Books {

    private final String title;

    public Books(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

class Library {

    private final List<Books> bookList;

    public Library(){
        bookList = new ArrayList<>();
    }

    public void addBook(Books book){
        bookList.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in Library..");
        bookList.forEach(b -> System.out.println(b.getTitle()));
    }
}