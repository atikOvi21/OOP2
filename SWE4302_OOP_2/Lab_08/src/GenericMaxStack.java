import java.util.Stack;

public class GenericMaxStack<Thingy extends Comparable<Thingy>> {
    private final int stackSize;
    private Thingy top;
    private Thingy max;
    private final Stack<Thingy> stack;
    private final Stack<Thingy> maxStack;


    public GenericMaxStack(int stackSize){
        this.stackSize = stackSize;
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(Thingy pushValue){
        if (stack.size() == stackSize){
            throw new StackOverflowError("Stack is full");
        }
        if (stack.isEmpty()){
            top = pushValue;
            max = pushValue;
            maxStack.push(pushValue);
        }
        else if (pushValue.compareTo(max) > 0){
            top = pushValue;
            max = pushValue;
            maxStack.push(pushValue);
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
        top = stack.peek();
        return stack.pop();
    }

    public Thingy max(){
        return max;
    }

    public Thingy top(){
        return top;
    }
}
