package WildCard;

import java.util.List;

public class WildcardBoundsExample {
    static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
