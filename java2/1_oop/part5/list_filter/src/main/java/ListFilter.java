import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {

    /**
     * Write a Java program to count the number of strings in a list
     * that start with a specific substring using streams
     * Also add useful dependencies into pom.xml and write a unit test
     *
     * For example:
     * list = {"labas", "laba", "kokteilis", "vakaras", "laukiu"}
     * subString = "la"
     * result = 3
     */
    public int countStrings(List<String> list, String subString) {
        return (int) list.stream()
                .filter(s -> s.startsWith(subString))
                .count();
    }

    /**
     * Write a Java program return a sub-list
     * containing all strings that start with a specific substring using streams
     *
     * Also add useful dependencies into pom.xml and write a unit test
     *
     * For example:
     * list = {"labas", "laba", "kokteilis", "vakaras", "laukiu"}
     * subString = "la"
     * result = {"labas", "laba", "laukiu"}
     */
    public List<String> filterStrings(List<String> list, String subString) {
        return list.stream()
                .filter(s -> s.startsWith(subString))
                .collect(Collectors.toList());
    }


}
