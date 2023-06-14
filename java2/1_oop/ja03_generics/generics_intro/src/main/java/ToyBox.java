import currencies.Currency;
import toys.Toy;

import java.util.Arrays;

class ToyBox implements Box<Toy> {
    private final Toy[] items;
    private int size;

    public ToyBox(Toy[] items) {
        this.items = items;
    }

    @Override
    public void putItem(Toy item) {
        this.items[size] = item;
        size++;
    }

    @Override
    public void putItems(Toy[] items) {
        for (Toy i : items)
            putItem(i);
    }

    @Override
    public void printItems() {
        System.out.println(Arrays.toString(items));
    }

    @Override
    public Toy[] getItems() {
        return items;
    }
}
