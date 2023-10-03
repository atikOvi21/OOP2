public class ISBN {
    private final String isbn;

    public ISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }

    public boolean isValid() {
        if (isbn == null || isbn.length() != 10 && isbn.length() != 13) {
            return false;
        }

        if (!isbn.matches("[0-9]+")) {
            return false;
        }

        if (isbn.length() == 10) {
            return isValidISBN10();
        } else {
            return isValidISBN13();
        }
    }

    private boolean isValidISBN10() {
        // Implement ISBN-10 validation logic
        return true;
    }

    private boolean isValidISBN13() {
        // Implement ISBN-13 validation logic
        return true;
    }
}


//Storing ISBN as a long integer or string directly without creating a separate
//ISBN class would be a poor design choice for several reasons:
//        Lack of Encapsulation: Storing ISBN as a primitive type (e.g., long or string) would
//        lead to a lack of encapsulation. ISBNs have a specific structure and meaning,
//        and by directly using primitive types, you lose the ability to encapsulate
//        the ISBN-related logic and enforce constraints on its format.

//        Reusability: Without a dedicated ISBN class, you would need to replicate ISBN-related
//        logic and validation code throughout your application, leading to code duplication and
//        maintainability issues.

//        Validation: ISBNs have validation rules (e.g., checksum calculation), which should be
//        encapsulated within the ISBN class. Without such a class, you may scatter validation
//        logic across your codebase, making it error-prone.

//        Code Smells: This design would lead to several code smells, including Lack of
//        Encapsulation, Duplicated Code, and Lack of Abstraction.
