package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    private static final String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
    private final List<String> list;

    public BinarySearch() {
        list = new ArrayList<String>(Arrays.asList(colors));
        Collections.sort(list);
        System.out.println("Sorted ArrayList : " + list);
    }

    public void search() {
        printSearchResults(colors[3]);
        printSearchResults(colors[0]);
        printSearchResults(colors[7]);
        printSearchResults("aqua");
        printSearchResults("grey");
        printSearchResults("teal");
    }

    private void printSearchResults(String key) {
        int result = 0;

        System.out.println("Searching for " + key);
        result = Collections.binarySearch(list, key);

        if(result >= 0) {
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Not found (" + result + ")");
        }

    }
}
