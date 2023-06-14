public class UnspecifiedBox implements Box {
    Object[] items = new Object[10];
    @Override
    public void putItem(Object item) {
        items[0] = item;
    }

    @Override
    public void putItems(Object[] item) {

    }

    @Override
    public void printItems() {

    }

    @Override
    public Object[] getItems() {
        return items;
    }
}
