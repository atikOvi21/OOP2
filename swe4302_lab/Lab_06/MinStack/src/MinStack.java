import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int minInStack;
    public MinStack(){
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void printStack(){
        System.out.println(stack);
        System.out.println(minStack);
    }

    public void push(int n){
        stack.push(n);

        if(stack.size() == 1){
            minInStack = stack.peek();
            minStack.push(minInStack);
        }else{
            if(n < minInStack){
                minInStack = n;
                minStack.push(minInStack);
            }
        }
    }

    public int pop(){
        int popped = stack.pop();
        if(popped == minInStack){
            minStack.pop();
            if(!minStack.isEmpty()){
                minInStack = minStack.peek();
            }
        }
        return popped;
    }

    public int min(){
        return minInStack;
    }
}
