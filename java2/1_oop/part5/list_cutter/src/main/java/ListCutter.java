import java.util.List;

public class ListCutter {

    /**
     * Write a Java program to extract a portion of an array list.
     * Also - add needed dependencies and write related unit test
     *
     * @param list - list to be cut, like: {"a", "b", "c", "d", "b", "c"}
     * @param start - index to start cutting the list from, like: 1
     * @param end - index to cut the list to (inclusively), like: = 3
     *
     * @return list that's a sub-list of the original, like ["b", "c", "d"]
     */
    public List<String> cut(List<String> list, int start, int end) {
        return list.subList(start, end + 1);
    }
}
