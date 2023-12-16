package CalculatorLamda;

public class Substracter implements ICalculator{
    @Override
    public int calculate(int a, int b) {
        if(a > b)
            return a - b;
        else
            return b - a;
    }
}
