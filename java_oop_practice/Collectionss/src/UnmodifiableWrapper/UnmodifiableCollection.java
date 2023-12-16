package UnmodifiableWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollection {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        List<Integer> readOnlyList = Collections.unmodifiableList(originalList);

//        List<Integer> unModifiableList = Collections.unmodifiableList(new ArrayList<>());
//        unModifiableList.add(1); // UnsupportedOperationException

        // Attempt to modify the read-only list
        try {
            readOnlyList.add(4);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        for (Integer item : readOnlyList) {
            System.out.println(item);
        }
    }
}
