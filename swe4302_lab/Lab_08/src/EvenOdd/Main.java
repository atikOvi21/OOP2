package EvenOdd;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating the counter algorithms
        EvenCounter<Integer> evenCounter = new EvenCounter<>();
        OddCounter<Integer> oddCounter = new OddCounter<>();
        MultipleThreeCounter<Integer> multipleThreeCounter = new MultipleThreeCounter<>();

        // Creating the list of integers and doubles
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);

        // Creating the counter
        Counter counter = new Counter();

        // Getting the count of each algorithm - INT
        int evenCountInt = counter.getTheCount(integers, evenCounter);
        int oddCountInt = counter.getTheCount(integers, oddCounter);
        int multipleCountInt = counter.getTheCount(integers, multipleThreeCounter);

        System.out.println("Counter Even-INT: " + evenCountInt);
        System.out.println("Counter Odd-INT: " + oddCountInt);
        System.out.println("Counter Multiple-INT: " + multipleCountInt);

        // Resetting the counters
        evenCounter.resetCount();
        oddCounter.resetCount();
        multipleThreeCounter.resetCount();

        System.out.println("--------------------------------------------------");

        // Getting the count of each algorithm - DOUBLE
        int evenCountDouble = counter.getTheCount(doubles, evenCounter);
        int oddCountDouble = counter.getTheCount(doubles, oddCounter);
        int multipleCountDouble = counter.getTheCount(doubles, multipleThreeCounter);

        System.out.println("Counter Even-DOUBLE: " + evenCountDouble);
        System.out.println("Counter Odd-DOUBLE: " + oddCountDouble);
        System.out.println("Counter Multiple-DOUBLE: " + multipleCountDouble);

    }
}
