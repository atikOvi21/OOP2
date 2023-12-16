public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(2);
        System.out.println("Pushed");
        minStack.printStack();
        System.out.println("Current Min : " + minStack.min());

        minStack.push(8);
        System.out.println("Pushed");
        minStack.printStack();
        System.out.println("Current Min : " + minStack.min());

        minStack.push(5);
        System.out.println("Pushed");
        minStack.printStack();
        System.out.println("Current Min : " + minStack.min());

        minStack.push(1);
        System.out.println("Pushed");
        minStack.printStack();
        System.out.println("Current Min : " + minStack.min());

        minStack.printStack();

        System.out.println("Pop : " + minStack.pop());
        minStack.printStack();
        System.out.println("Current Min : " + minStack.min());
    }
}