import currencies.Currency;

import java.util.Arrays;

class CurrencyBox implements Box<Currency> {
    private final Currency[] items;
    private int size;

    public CurrencyBox(Currency[] items) {
        this.items = items;
    }

    @Override
    public void putItem(Currency item) {
        this.items[size] = item;
        size++;
    }

    @Override
    public void putItems(Currency[] items) {
        for (Currency i : items)
            putItem(i);
    }

    @Override
    public void printItems() {
        System.out.println(Arrays.toString(items));
    }

    @Override
    public Currency[] getItems() {
        return items;
    }
}
