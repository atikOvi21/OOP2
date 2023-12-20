package GenericStack;

public class StackFullException extends RuntimeException{
    public StackFullException() {
        this("Stack is full");
    }

    public StackFullException(String exception) {
        super(exception);
    }
}
