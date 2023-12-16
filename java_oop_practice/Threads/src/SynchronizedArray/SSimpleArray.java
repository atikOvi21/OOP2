package SynchronizedArray;

import java.util.Random;

public class SSimpleArray {
    private final int[] array;
    private int writeIndex = 0;
    private final static Random generator = new Random();

    public SSimpleArray(int size) {
        array = new int[size];
    }

    public synchronized void add(int value) {
        int position = writeIndex;

        try{
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        array[position] = value;
        System.out.println(STR."\{Thread.currentThread().getName()} wrote \{value} to element \{position}.");
        writeIndex++;
        System.out.println(STR."Next write index: \{writeIndex}");
    }

    public String toString() {
        StringBuilder arrayString = new StringBuilder("\nContents of SimpleArray:\n");
        for (int j : array) {
            arrayString.append(j).append(" ");
        }
        return arrayString.toString();
    }
}
