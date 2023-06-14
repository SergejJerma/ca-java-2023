class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        System.out.println(item.toString() + " " + item.getClass().getSimpleName());
    }

    public T getItem() {
        return item;
    }
}
