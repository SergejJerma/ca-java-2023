import java.util.List;

public class ArraySwapper {

    /* 14. Write a Java program that swaps two elements in an array list.  */
    public void swap(List<String> list, int indexA, int indexB) {
        String elementA = list.get(indexA);
        String elementB = list.get(indexB);

        list.set(indexA, elementB);
        list.set(indexB, elementA);
    }


    public void sort(List<String> listToSort) {
        listToSort.sort(String::compareTo);
    }
}
