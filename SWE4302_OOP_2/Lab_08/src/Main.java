public class Main {
    public static void main(String[] args) {
        GenericMaxStack<Integer> intMaxStack = new GenericMaxStack<>(5);

        intMaxStack.push(3);
        intMaxStack.push(5);
        intMaxStack.push(2);

        int resultMax = intMaxStack.max();

        System.out.println(resultMax);
    }
}