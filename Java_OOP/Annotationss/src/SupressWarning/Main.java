package SupressWarning;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List rawList = new ArrayList(); // Using a raw type

        rawList.add("Hello");
        rawList.add("World");

        // Warning: unchecked call to add(E)
        List<String> list = (List<String>) rawList; // Type casting to a generic type

        for (String item : list) {
            System.out.println(item);
        }
    }
}