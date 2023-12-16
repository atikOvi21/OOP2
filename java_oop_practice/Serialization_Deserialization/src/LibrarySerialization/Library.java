package LibrarySerialization;

import java.io.Serializable;
import java.util.List;

public class Library implements Serializable {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return STR."Library{ Books: \{books} }";
    }
}
