package LibrarySerialization;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    private final String title;
    private final List<Author> authors;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return STR."Book{ Title: \{title} Authors: \{authors} }";
    }
}
