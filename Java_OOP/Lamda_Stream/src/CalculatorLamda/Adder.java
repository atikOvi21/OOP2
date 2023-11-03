package CalculatorLamda;

public class Adder implements ICalculator{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
