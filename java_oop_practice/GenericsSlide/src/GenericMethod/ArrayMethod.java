package GenericMethod;

public class ArrayMethod {
    public static <Thing> void printArray(Thing[] inputArray) {
        for (Thing thingy : inputArray) {
            System.out.println(thingy);
        }
    }
}
