package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // MAP
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        List<Integer> squares = numbers.stream().map(x -> x*x).toList();
        System.out.println(squares);

        // FILTER
        List<String> names = Arrays.asList("Reflection","Stream","Collection");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).toList();
        System.out.println(result);

        // SORT
        List<String> sorted = names.stream().sorted().toList();
        System.out.println(sorted);


        // REDUCE
        int even = numbers.stream().filter(x->x%2==0).reduce(0, (ans, i) -> ans - i);
        System.out.println(even);


        // FOR EACH
        numbers.stream().map(x->x*x).forEach(y->System.out.println(y));


        // COLLECT
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);
    }
}
