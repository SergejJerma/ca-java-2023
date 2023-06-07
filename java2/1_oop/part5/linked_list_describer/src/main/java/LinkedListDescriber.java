import java.util.*;

public class LinkedListDescriber {
    /**
     * Write a Java program (and a unit test) to display elements and their positions in a list
     * @param list linked list containing strings
     * @return a map, containing the elements and their positions in the linked list
     *
     * For example:
     * given a list = ["", "a", "b", "c", "d", "d", "d", ""]
     * expect output = {"": [0, 7], "a": [1], "b": [2], "c": [3], "d": [4, 5, 6]}
     */
    public Map<String, Integer[]> describe(List<String> list) {
        Map<String, Integer[]> result = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (result.containsKey(element)) {
                Integer[] indexes = result.get(element);
                Integer[] newIndexes = Arrays.copyOf(indexes, indexes.length + 1);
                newIndexes[indexes.length] = i;
                result.put(element, newIndexes);
            } else {
                result.put(element, new Integer[] {i});
            }
        }

        return result;
    }
}
