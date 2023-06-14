import toys.Toy;

import java.util.Arrays;

class ToyBox implements Box<Toy> {
    private final Toy[] items;
    private int size;

    public ToyBox(Toy[] items) {
        this.items = items;
    }

    public void putItems(Toy item) {
        this.items[size] = item;
        size++;
    }

    public void printItems() {
        System.out.println(Arrays.toString(items));
    }

    public Toy[] getItems() {
        return items;
    }
}
