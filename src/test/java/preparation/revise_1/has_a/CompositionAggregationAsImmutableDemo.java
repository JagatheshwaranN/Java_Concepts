package preparation.revise_1.has_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompositionAggregationAsImmutableDemo {

    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jk@example.com");
        Book book = new Book("Harry Potter", List.of(author), 1997);
        BookCollection collection = new BookCollection(List.of(book));

        System.out.println("Books in collection:");
        for (Book b : collection.getBooks()) {
            System.out.print(b.getTitle() + ", " + b.getPublicationYear());
            for (Author a : b.getAuthors()){
                System.out.println(", "+ a.getName());
            }
        }
    }


}

final class Author {
    private final String name;
    private final String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

final class Book {
    private final String title;
    private final List<Author> authors; // Aggregation of immutable Authors
    private final int publicationYear;

    public Book(String title, List<Author> authors, int publicationYear) {
        this.title = title;
        this.authors = List.copyOf(authors); // Defensive copy for immutability
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors; // Already unmodifiable
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

final class BookCollection {
    private final List<Book> books; // Composition

    public BookCollection(List<Book> books) {
        this.books = List.copyOf(books); // Deep copy + Unmodifiable
    }

    public List<Book> getBooks() {
        return books;
    }

    // Example method to find books by year
    public List<Book> findBooksByPublicationYear(int year) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublicationYear() == year) {
                foundBooks.add(book);
            }
        }
        return Collections.unmodifiableList(foundBooks);
    }
}