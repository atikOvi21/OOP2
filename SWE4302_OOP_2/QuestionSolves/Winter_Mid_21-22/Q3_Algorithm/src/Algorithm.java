import java.util.List;
import java.util.function.Predicate;

public class Algorithm<T> {
    public int count(List<T> list, Predicate<T> condition) {
        int count = 0;
        for (T element : list) {
            if (condition.test(element)) {
                count++;
            }
        }
        return count;
    }
}

// The Algorithm class is a generic class. It has a single type parameter T.
// The count method takes a list of elements of type T and a predicate of type T.
// The predicate is used to test each element of the list.
// The count method returns the number of elements that satisfy the predicate.
// The count method can be used with any type of list and any predicate.