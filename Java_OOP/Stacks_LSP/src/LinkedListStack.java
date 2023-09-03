public class LinkedListStack<T> implements Stack<T> {
    private Node<T> top;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    @Override
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            T item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
