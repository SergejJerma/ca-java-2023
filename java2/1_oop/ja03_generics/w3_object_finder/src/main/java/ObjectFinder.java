import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ObjectFinder {

    /**
     * 3. Write a Java program to create a generic method that takes a list of any type and a target element.
     * It returns the index of the first occurrence of the target element in the list.
     * Return -1 if the target element cannot be found.
     */
    public static <T> int find(List<T> list, T toFind) {
        if (list == null || toFind == null)
            return -1;
        return list.indexOf(toFind);
    }

    /**
     * 6. Write a Java program to create a generic method that takes a list of any type and a predicate.
     * It returns an array list containing only elements that satisfy the predicate.
     */
    public static <T> List<T> filterFind(List<T> list, Predicate<T> conditionToInclude) {
        if (list == null || conditionToInclude == null)
            return Collections.emptyList();
        return list.stream()
                .filter(conditionToInclude)
                .collect(Collectors.toList());
    }

}
