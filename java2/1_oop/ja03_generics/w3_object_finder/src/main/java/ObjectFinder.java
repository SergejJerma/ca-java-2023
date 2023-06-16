import java.util.List;

/**
 * 3. Write a Java program to create a generic method that takes a list of any type and a target element.
 * It returns the index of the first occurrence of the target element in the list.
 * Return -1 if the target element cannot be found.
 */

public class ObjectFinder {

    public static <T> int find(List<T> list, T toFind) {
        if (list == null || toFind == null)
            return -1;
        return list.indexOf(toFind);
    }
}
