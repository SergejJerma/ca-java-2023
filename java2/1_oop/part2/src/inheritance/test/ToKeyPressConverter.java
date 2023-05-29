package inheritance.test;

import java.util.HashMap;
import java.util.Map;

public class ToKeyPressConverter implements Converter {

    Map<String, String> letterKeyPressMap = new HashMap<>();    //key is String like "L"

    public void put(String letter, String numbers) {
        letterKeyPressMap.put(letter, numbers);
    }

    @Override
    public String convert(String letter) {
        return letterKeyPressMap.get(letter);
    }

}
