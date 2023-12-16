package LibrarySerialization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SerializationManager serializationManager = new SerializationManager("src/LibrarySerialization/library.ser");

        Author author1 = new Author("John Smith");
        Author author2 = new Author("Jane Doe");

        List<Author> book1Authors = new ArrayList<>();
        book1Authors.add(author1);

        List<Author> book2Authors = new ArrayList<>();
        book2Authors.add(author2);

        Book book1 = new Book("Introduction to Java", book1Authors);
        Book book2 = new Book("Advanced Java Programming", book2Authors);

        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(book1);
        libraryBooks.add(book2);

        Library library = new Library(libraryBooks);

        // Serialize
        serializationManager.serialize(library);

        // Deserialize
        Library deserializedLibrary = (Library) serializationManager.deserialize();
        System.out.println("Deserialized Library: " + deserializedLibrary);
    }
}
