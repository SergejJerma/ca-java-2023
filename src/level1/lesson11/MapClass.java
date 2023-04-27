package level1.lesson11;

import java.util.HashMap;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");

        System.out.println(map);

        map.put("key6", "value5");
        System.out.println("map after map.put(\"key6\", \"value5\"): " + map);

        //simply overwrites
        map.put("key5", "value5555555");
        System.out.println("map after map.put(\"key5\", \"value5555555\"): " + map);


        System.out.println("map.get(\"key5\"): " + map.get("key5"));

        map.remove("key5");
        System.out.println("map after key key5 is removed: " + map);


        Set<String> keys = map.keySet();
        System.out.println("keys:" + keys);
    }
}
