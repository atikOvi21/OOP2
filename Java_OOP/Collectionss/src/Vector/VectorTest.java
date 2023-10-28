package Vector;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorTest {
    private static final String[] colors = {"red", "white", "blue"};

    public VectorTest() {
        Vector<String> vector = new Vector<String>();
        printVector(vector);

        Collections.addAll(vector, colors);

        printVector(vector);

        try {
            System.out.printf("First element: %s\n", vector.firstElement());
            System.out.printf("Last element: %s\n", vector.lastElement());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        if (vector.contains("red")) {
            System.out.printf("\n\"red\" found at index %d\n", vector.indexOf("red"));
        } else {
            System.out.println("\n\"red\" not found");
        }

        vector.remove("red");
        System.out.println("\nVector after removing \"red\":");
        printVector(vector);

        if (vector.contains("red")) {
            System.out.printf("\n\"red\" found at index %d\n", vector.indexOf("red"));
        } else {
            System.out.println("\n\"red\" not found");
        }

        System.out.printf("\nSize: %d\nCapacity: %d\n", vector.size(), vector.capacity());

    }

    private void printVector(Vector<String> vector) {
        if (vector.isEmpty()) {
            System.out.println("Vector is empty");
        } else {
            System.out.print("Vector: ");
            for (String element : vector) {
                System.out.printf("%s ", element);
            }
            System.out.println();
        }
    }
}
