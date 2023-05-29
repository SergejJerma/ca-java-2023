package inheritance.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ToLetterConverter implements Converter {

    Map<String, String> numberKeyPressMap = new HashMap<>();    //key is String like "555"

    public void put(String numbers, String letter) {
        numberKeyPressMap.put(numbers, letter);
    }

    @Override
    public String convert(String numbers) {
        return numberKeyPressMap.get(numbers);
    }
}
