package LibrarySerialization;

import java.io.Serializable;

public class Author implements Serializable {
    private final String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
