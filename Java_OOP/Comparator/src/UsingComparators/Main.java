package UsingComparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Goodbye");
        strings.add("World");
        strings.add("!!");
        System.out.println(strings);

        Comparator<String> comparator = new StringLengthComparator();
        strings.sort(comparator);
        System.out.println(strings);
    }
}
