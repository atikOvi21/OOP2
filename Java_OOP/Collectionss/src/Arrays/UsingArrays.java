package Arrays;

import java.util.Arrays;

public class UsingArrays {
    private int[] intArray = {1, 2, 3, 4, 5};
    private double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
    private int[] filledIntArray;
    private int[] intArrayCopy;

    public UsingArrays(){
        filledIntArray = new int[10];
        intArrayCopy = new int[intArray.length];

        Arrays.fill(filledIntArray, 12);
        Arrays.sort(doubleArray);

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
    }

    public void printArrays(){
        System.out.println("filledIntArray: ");
        for (int element : filledIntArray) System.out.println(element);

        System.out.println("intArray: ");
        for (int element : intArray) System.out.println(element);

        System.out.println("doubleArray: ");
        for (double element : doubleArray) System.out.println(element);

        System.out.println("intArrayCopy: ");
        for (int element : intArrayCopy) System.out.println(element);
    }

    public int searchForInt(int value){
        if(Arrays.binarySearch(intArray, value) >= 0)
            return Arrays.binarySearch(intArray, value);
        else
            return -1;
    }

    public boolean isEqual(){
        return Arrays.equals(intArray, intArrayCopy);
    }
}
