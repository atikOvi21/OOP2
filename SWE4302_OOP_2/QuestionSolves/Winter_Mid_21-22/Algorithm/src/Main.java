import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Algorithm<Integer> intAlgorithm = new Algorithm<>();
        int evenCount = intAlgorithm.count(intList, x -> x % 2 == 0);
        System.out.println("Even numbers count: " + evenCount);
    }

    // The count method takes in a list of integers and a predicate that tests if an integer is even.
    // The count method returns the number of even integers in the list.
}