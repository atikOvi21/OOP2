package WildCard;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        double sumIntegers = WildcardBoundsExample.sumNumbers(integers);
        double sumDoubles = WildcardBoundsExample.sumNumbers(doubles);

        System.out.println("Sum of Integers: " + sumIntegers);
        System.out.println("Sum of Doubles: " + sumDoubles);
    }
}
