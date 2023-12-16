package BasicEvenOdd;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating the counter algorithms
        EvenOddCounter<Integer> intCounter = new EvenOddCounter<>();
        EvenOddCounter<Double> doubleCounter = new EvenOddCounter<>();

        // Creating the list of integers and doubles
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        int evenCountINT = intCounter.getCount(integers, "even");
        int oddCountINT = intCounter.getCount(integers, "odd");

        System.out.println("Even Count - INT : " + evenCountINT);
        System.out.println("Odd Count - INT : " + oddCountINT);

        intCounter.resetCount();

        System.out.println("--------------------------------------------------");

        int evenCountDOUBLE = doubleCounter.getCount(doubles, "even");
        int oddCountDOUBLE = doubleCounter.getCount(doubles, "odd");

        System.out.println("Even Count - DOUBLE : " + evenCountDOUBLE);
        System.out.println("Odd Count - DOUBLE : " + oddCountDOUBLE);

        doubleCounter.resetCount();


    }
}
