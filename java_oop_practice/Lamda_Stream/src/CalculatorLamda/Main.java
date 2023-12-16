package CalculatorLamda;

public class Main {
    public static void main(String[] args) {

        ICalculator adder = new Adder();
        System.out.println("Implementation of Concrete Adder");
        System.out.println(adder.calculate(10, 5));

        System.out.println("--------------------------------------------");

        ICalculator iCalculator = new ICalculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Anonymous Implementation of ICalculator");
        System.out.println(iCalculator.calculate(10, 5));

        System.out.println("--------------------------------------------");

        ICalculator add = (a, b) -> a + b;
        System.out.println("Lambda Implementation of ICalculator");
        System.out.println(add.calculate(10, 5));

        System.out.println("--------------------------------------------");

        ICalculator subs = new Substracter();
        System.out.println("Implementation of Concrete Substracter");
        System.out.println(subs.calculate(3, 5));

        System.out.println("--------------------------------------------");

        ICalculator iCalculatorSub = new ICalculator() {
            @Override
            public int calculate(int a, int b) {
                if(a > b) return a - b;
                else return b - a;
            }
        };
        System.out.println("Anonymous Implementation of ICalculator");
        System.out.println(iCalculatorSub.calculate(3, 5));

        System.out.println("--------------------------------------------");

        ICalculator sub = (a, b) -> {
            if(a > b) return a - b;
            else return b - a;
        };
        System.out.println("Lambda Implementation of ICalculator");
        System.out.println(sub.calculate(3, 5));

    }
}
