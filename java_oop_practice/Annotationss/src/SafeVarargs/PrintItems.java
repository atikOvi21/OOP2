package SafeVarargs;

public class PrintItems {
    @SafeVarargs
    public static <T> void printItems(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
