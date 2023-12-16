package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    private static final String[] suits = {
        "Ek-Kona", "Ek-Pata", "Tin-Pata", "Dui-Kona"
    };

    public void printElements() {
        List<String> list = Arrays.asList(suits);
        System.out.println("Unsorted array elements: " + list);

        Collections.sort(list);
        System.out.println("Sorted array elements: " + list);

        list.sort(Collections.reverseOrder());
        System.out.println("Reverse sorted array elements: " + list);
    }
}
