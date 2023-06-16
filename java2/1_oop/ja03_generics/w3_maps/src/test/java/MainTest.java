import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void printMap_keyStringValueString_prints() {
        Map<String, String> mapStringString = new HashMap<>();
        mapStringString.put("key1", "value1");
        mapStringString.put("key2", "value2");
        mapStringString.put("key3", "value3");

        assertDoesNotThrow(() -> MapPrinter.printMap(mapStringString));
    }

    @Test
    void printMap_keyIntegerValueString_prints() {
        Map<Integer, String> mapIntegerString = new HashMap<>();
        mapIntegerString.put(1, "value1");
        mapIntegerString.put(2, "value2");
        mapIntegerString.put(3, "value3");

        assertDoesNotThrow(() -> MapPrinter.printMap(mapIntegerString));
    }

    @Test
    void printMap_keyObjectValueObject_prints() {
        Map<Object, Object> mapObjectObject = new HashMap<>();
        mapObjectObject.put(1, "value1");
        mapObjectObject.put("key2", 2.0);
        mapObjectObject.put(new ArrayList<>(), "value3");

        assertDoesNotThrow(() -> MapPrinter.printMap(mapObjectObject));
    }
}