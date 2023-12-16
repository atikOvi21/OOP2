public class Main {
    public static void main(String[] args) {
        GenericContainer<Integer> intContainer = new GenericContainer<Integer>(5);
        intContainer.printItemAndType("Hello");

        GenericContainer<String> stringContainer = new GenericContainer<String>("Hello");
        stringContainer.printItemAndType(5);

        Integer[] intArray = { 5, 10, 3, 8, 1 };
        Double[] doubleArray = { 3.2, 2.7, 1.5, 4.9, 2.1 };
        String[] stringArray = { "apple", "banana", "cherry", "date", "fig" };

        Integer maxInt = GenericUtils.findMax(intArray);
        Double maxDouble = GenericUtils.findMax(doubleArray);
        String maxString = GenericUtils.findMax(stringArray);

        System.out.println("Max Integer: " + maxInt);
        System.out.println("Max Double: " + maxDouble);
        System.out.println("Max String: " + maxString);

        Integer minInt = GenericUtils.findMin(intArray);
        Double minDouble = GenericUtils.findMin(doubleArray);
        String minString = GenericUtils.findMin(stringArray);

        System.out.println("Min Integer: " + minInt);
        System.out.println("Min Double: " + minDouble);
        System.out.println("Min String: " + minString);

        double intSum = NumberUtils.sum(intArray);
        double doubleSum = NumberUtils.sum(doubleArray);

        System.out.println("Sum of Integers: " + intSum);
        System.out.println("Sum of Doubles: " + doubleSum);
    }
}