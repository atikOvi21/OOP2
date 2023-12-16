package Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Algorithms_Frequency {
    private String[] colors = {"red", "white", "yellow", "blue"};
    private List<String> list;
    private Vector<String> vector = new Vector<String>();

    public Algorithms_Frequency() {
        list = Arrays.asList(colors);
        vector.add("black");
        vector.add("red");
        vector.add("green");

        System.out.println("\nBefore addAll(), vector contains:");
        System.out.print("[ ");
        for(String s : vector){
            System.out.print(s + " ");
        }
        System.out.println("]");

        Collections.addAll(vector, colors);
        System.out.println("\nAfter addAll(), vector contains:");
        System.out.print("[ ");
        for(String s : vector){
            System.out.print(s + " ");
        }
        System.out.println("]");

        int frequency = Collections.frequency(vector, "red");
        System.out.println("\nFrequency of red in vector: " + frequency);

        boolean disjoint = Collections.disjoint(list, vector);
        System.out.println("list and vector " + (disjoint ? "do not " : "do ") + "contain elements in common");
    }
}
