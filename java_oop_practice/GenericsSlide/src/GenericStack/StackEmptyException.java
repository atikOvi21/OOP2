package GenericStack;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        this("Stack is empty");
    }

    public StackEmptyException(String exception) {
        super(exception);
    }
}
