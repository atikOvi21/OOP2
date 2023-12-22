package Wildcards;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3);
        List<Number> numbers = List.of(1, 2.3, 3.4);


        WildcardClass<Integer> wildcardClass = new WildcardClass<>();
        System.out.println(wildcardClass.countOfList(ints));

        WildcardClass<Number> wildcardClass2 = new WildcardClass<>();
        System.out.println(wildcardClass2.countOfList(numbers));
    }
}
