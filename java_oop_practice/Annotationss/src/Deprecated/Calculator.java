package Deprecated;

public class Calculator {

    /**
     * This method has been deprecated because it uses an outdated algorithm.
     * Please use the calculateSum(int a, int b) method instead.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     * @deprecated
     */
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }
}

