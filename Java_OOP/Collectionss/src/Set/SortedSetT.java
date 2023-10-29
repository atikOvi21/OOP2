package Set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetT {
    private static final String[] colors = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green", "blue"};

    public SortedSetT() {
        SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors));

        System.out.println("Sorted Set: ");
        printSet(tree);

        System.out.println("headSet(\"orange\"): ");
        printSet(tree.headSet("orange"));

        System.out.println("tailSet(\"orange\"): ");
        printSet(tree.tailSet("orange"));

        System.out.println("first: " + tree.first());
        System.out.println("last: " + tree.last());
    }

    private void printSet(SortedSet<String> set){
        for(String s : set){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
