package inheritance.test;

public class ConverterFactory {

    static ToLetterConverter toLetterConverter;
    static ToKeyPressConverter toKeyPressConverter;

    public static Converter getConverter(ConverterType type) {
        if (toLetterConverter == null || toKeyPressConverter == null)
            prepare();
        if (type == ConverterType.TO_LETTER)
            return toLetterConverter;
        return toKeyPressConverter;
    }

    private static void prepare() {
        toLetterConverter = new ToLetterConverter();
        toKeyPressConverter = new ToKeyPressConverter();
        addKeyValue("2", "A");
        addKeyValue("22", "B");
        addKeyValue("222", "C");
        addKeyValue("3", "D");
        addKeyValue("33", "E");
        addKeyValue("333", "F");
        addKeyValue("4", "G");
        addKeyValue("44", "H");
        addKeyValue("444", "I");
        addKeyValue("5", "J");
        addKeyValue("55", "K");
        addKeyValue("555", "L");
        addKeyValue("6", "M");
        addKeyValue("66", "N");
        addKeyValue("666", "O");
        addKeyValue("7", "P");
        addKeyValue("77", "Q");
        addKeyValue("777", "R");
        addKeyValue("7777", "S");
        addKeyValue("8", "T");
        addKeyValue("88", "U");
        addKeyValue("888", "V");
        addKeyValue("9", "W");
        addKeyValue("99", "X");
        addKeyValue("999", "V");
        addKeyValue("9999", "Z");
        addKeyValue("0", " ");
        addKeyValue("00", "\n");
    }

    private static void addKeyValue(String numbers, String letter) {
        toLetterConverter.put(numbers, letter);
        toKeyPressConverter.put(letter, numbers);
    }
}
