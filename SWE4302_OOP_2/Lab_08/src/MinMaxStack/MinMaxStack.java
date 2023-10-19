package MinMaxStack;

import java.util.Stack;

public class MinMaxStack<Thingy extends Comparable<Thingy>> {
    private final int stackSize;
    private Thingy top;
    private Thingy max;
    private Thingy min;
    private final Stack<Thingy> stack;
    private final Stack<Thingy> maxStack;
    private final Stack<Thingy> minStack;


    public MinMaxStack(int stackSize){
        this.stackSize = stackSize;
        stack = new Stack<>();
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Thingy pushValue){
        if (stack.size() == stackSize){
            throw new StackOverflowError("Stack is full");
        }
        if (stack.isEmpty()){
            top = pushValue;
            max = pushValue;
            min = pushValue;
            maxStack.push(pushValue);
            minStack.push(pushValue);
        }
        else if (pushValue.compareTo(max) > 0){
            top = pushValue;
            max = pushValue;
            maxStack.push(pushValue);
        }
        else if (pushValue.compareTo(min) < 0){
            top = pushValue;
            min = pushValue;
            minStack.push(pushValue);
        }
        else {
            top = pushValue;
        }
        stack.push(pushValue);
    }

    public Thingy pop(){
        if (stack.isEmpty()){
            throw new StackOverflowError("Stack is empty");
        }
        if (stack.peek().compareTo(max) == 0){
            maxStack.pop();
            if (!maxStack.isEmpty()){
                max = maxStack.peek();
            }
        }
        if (stack.peek().compareTo(min) == 0){
            minStack.pop();
            if (!minStack.isEmpty()){
                min = minStack.peek();
            }
        }
        top = stack.peek();
        return stack.pop();
    }

    public Thingy min(){
        return min;
    }

    public Thingy minMax(String operation){
        if (operation.equals(("max"))){
            return max;
        } else if (operation.equals("min")){
            return min;
        } else {
            throw new IllegalArgumentException("Invalid operation");
        }
    }

    public Thingy top(){
        return top;
    }
}
