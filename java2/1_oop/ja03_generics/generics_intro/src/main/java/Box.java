import java.util.Arrays;

class Box<T> {
    private final T[] items;
    private int size;

    public Box(T[] items) {
        this.items = items;
    }

    public void putItems(T item) {
        this.items[size] = item;
        size++;
    }

    public void printItems() {
        System.out.println(Arrays.toString(items));
    }

    public T[] getItems() {
        return items;
    }
}
