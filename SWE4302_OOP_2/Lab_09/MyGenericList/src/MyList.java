public class MyList<T> {
    private T[] items;
    private int size;

    public MyList() {
        items = (T[]) new Object[10];
        size = 0;
    }

    private void extendList(){
        if(isFull()){
            T[] temp = (T[]) new Object[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
    }

    private boolean isFull() {
        return size == items.length;
    }

    public void addItem(T elt) {
        items[size] = elt;
        size++;
    }

    public T getItem(int index) {
        return items[index];
    }

    public T removeItem(int index) {
        T removedItem = items[index];
        if(index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            size--;
            return removedItem;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T elt){
        for (int i = 0; i < size; i++) {
            if (items[i].equals(elt)) {
                return true;
            }
        }
        return false;
    }

    public T[] toArray() {
        return items;
    }

    public void clear() {
        items = (T[]) new Object[10];
        size = 0;
    }
}

