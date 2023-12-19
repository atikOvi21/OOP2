package GenericMethod;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'G', 'O', 'O', 'D', 'B', 'Y', 'E'};

        System.out.println("Int Array : ");
        ArrayMethod.printArray(intArray);

        System.out.println("Double Array : ");
        ArrayMethod.printArray(doubleArray);

        System.out.println("Char Array : ");
        ArrayMethod.printArray(charArray);

    }
}
