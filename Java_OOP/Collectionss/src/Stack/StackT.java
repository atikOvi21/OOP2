package Stack;

import java.util.Stack;

public class StackT {
    public StackT() {
        Stack<Number> stack = new Stack<Number>();

        Long longNumber = 12L;
        Integer integerNumber = 345;
        Float floatNumber = 1.23F;
        Double doubleNumber = 123.456;

        stack.push(longNumber);
        printStack(stack);
        stack.push(integerNumber);
        printStack(stack);
        stack.push(floatNumber);
        printStack(stack);
        stack.push(doubleNumber);
        printStack(stack);

        while (!stack.isEmpty()) {
            Number removedObject = stack.pop();
            System.out.println(removedObject + " popped");
            printStack(stack);
        }
    }

    private void printStack(Stack<Number> stack){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contains: " + stack);
        }
    }

}
