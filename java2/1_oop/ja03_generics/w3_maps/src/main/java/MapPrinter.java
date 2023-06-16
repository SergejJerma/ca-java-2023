import java.util.Map;
import java.util.Set;

/**
 * 7. Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.
 */
public class MapPrinter {

    public static <K, V> void printMap(Map<K, V> map) {
        Set<K> keySet = map.keySet();
        for (K key : keySet) {
            System.out.println(key + " : " + map.get(key));
        }

        map.forEach((k, v) -> System.out.println(k + " : " + v));

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

