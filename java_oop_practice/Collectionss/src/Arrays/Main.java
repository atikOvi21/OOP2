package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsingArrays usingArrays = new UsingArrays();

        usingArrays.printArrays();
        System.out.println(usingArrays.isEqual());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search for: ");
        int input = scanner.nextInt();

        if(usingArrays.searchForInt(input) >= 0)
            System.out.println("Found " + input + " at index " + usingArrays.searchForInt(input));
        else
            System.out.println(input + " not found");
    }
}