package SafeVarargs;

public class Main {
    public static void main(String[] args) {
        PrintItems.printItems("Goodbye", "Fuked", "Up", "World");
        PrintItems.printItems(1, 2, 3, 4, 5);
    }
}
