public class Node<T extends Shape> {
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) { this.data = data; }
    public T getData() { return data; }
}
