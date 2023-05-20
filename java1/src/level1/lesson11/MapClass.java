package level1.lesson11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

        System.out.println("Iterate over map using while loop");
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> mentry = (Map.Entry) iterator.next();
            System.out.println("key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
        }

        System.out.println("Iterate over map using for loop");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println("key is: " + entry.getKey() + " & Value is: " + entry.getValue());
        }

        System.out.println("HashMap dydis: "+ map.size());

        String removed =  map.remove("key3");
        System.out.println("Istrinta reiksme: " + removed);
        System.out.println("map: " + map);


        System.out.println("map.isEmpty(): " + map.isEmpty());

        boolean containsKey = map.containsKey("key2");
        System.out.println("map containsKey key2: " + containsKey);

        boolean containsValue = map.containsValue("value4");
        System.out.println("map containsValue value4: " + containsValue);

        map.clear();
        System.out.println("map atlikus clear(): " + map);
    }
}
