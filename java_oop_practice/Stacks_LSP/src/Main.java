public class Main {
    public static void main(String[] args) {
        Stack<Integer> arrayStack = new ArrayStack<>(5);
        Stack<Integer> linkedListStack = new LinkedListStack<>();

        arrayStack.push(1);
        arrayStack.push(2);
        linkedListStack.push(1);
        linkedListStack.push(2);

        System.out.println("ArrayStack pop: " + arrayStack.pop());
        System.out.println("LinkedListStack pop: " + linkedListStack.pop());
    }
}