package RawTypes;

import GenericStack.StackEmptyException;
import GenericStack.StackFullException;

public class StackClass<T> {
    private final int size;
    private int top;
    private final T[] elements;

    public StackClass() {
        this(10);
    }

    public StackClass(int s) {
        size = s > 0 ? s : 10;
        top = -1;
        elements = (T[]) new Object[size];
    }

    public void push(T pushValue) {
        if(top == size - 1) {
            throw new StackFullException(String.format("Stack is full, cannot push %s", pushValue));
        }

        elements[++top] = pushValue;
    }

    public T pop() {
        if(top == -1) {
            throw new StackEmptyException("Stack is empty, cannot pop");
        }

        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
