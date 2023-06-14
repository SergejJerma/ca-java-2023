import currencies.Currency;

import java.util.Arrays;

class CurrencyBox implements Box<Currency> {
    private final Currency[] items;
    private int size;

    public CurrencyBox(Currency[] items) {
        this.items = items;
    }

    public void putItems(Currency item) {
        this.items[size] = item;
        size++;
    }

    public void printItems() {
        System.out.println(Arrays.toString(items));
    }

    public Currency[] getItems() {
        return items;
    }
}
