package CommonComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sortable> items = new ArrayList<>();
        items.add(new Person("John"));
        items.add(new Person("Steve"));
        items.add(new Product("Apple"));
        items.add(new Product("Samsung"));

        for (Sortable s : items) {
            System.out.println(s.getName());
        }

        System.out.println("After sorting:");
        Comparator<Sortable> nameComparator = new NameComparator();
        items.sort(nameComparator);

        for (Sortable s : items) {
            System.out.println(s.getName());
        }
    }
}
