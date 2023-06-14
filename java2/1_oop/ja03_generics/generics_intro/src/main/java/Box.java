interface Box<T> {

    void putItem(T item);

    void putItems(T[] item);

    void printItems();

    T[] getItems();
}
