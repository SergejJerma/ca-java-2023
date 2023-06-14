/*
We can use anything instead of "T"
But it's a matter of convension (culture) to use:
    K - key
    V - value
    E - element / entry
    T - type
    N - number
*/
interface Box<T> {

    void putItem(T item);

    void putItems(T[] item);

    void printItems();

    T[] getItems();
}
