public class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int size;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    public void push(T item) {
        if (size < capacity) {
            array[size++] = item;
        }
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            T item = array[--size];
            array[size] = null;
            return item;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
