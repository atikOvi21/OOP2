public class Main {
    public static void main(String[] args) {
        String isbn = "9780134685991";
        ISBN isbnObj = new ISBN(isbn);

        if (isbnObj.isValid()) {
            System.out.println("Valid ISBN");
        } else {
            System.out.println("Invalid ISBN");
        }
    }
}