package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        System.out.println(addition.operate(2, 2));
        System.out.println(subtraction.operate(5, 2));
        System.out.println(multiplication.operate(3, 2));
        System.out.println(division.operate(6, 3));
    }
}
