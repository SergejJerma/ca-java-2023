package inheritance.test;

public class Main {
    public static void main(String[] args) {
        Converter toKeyPressConverter = ConverterFactory.getConverter(ConverterType.TO_NUMBER);
        Converter toLetterConverter = ConverterFactory.getConverter(ConverterType.TO_LETTER);

        System.out.println(toKeyPressConverter.convert("A"));
        System.out.println(toLetterConverter.convert("22"));

        //words to text
        for (char c : "LABAS VAKARAS".toCharArray())
            System.out.print(toKeyPressConverter.convert(String.valueOf(c)));
        System.out.println();

    }
}
