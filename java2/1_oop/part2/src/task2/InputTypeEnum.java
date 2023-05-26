package task2;

public enum InputTypeEnum {
    DIGITS,
    LETTERS;

    public static InputTypeEnum getType(String userInput) {
        return (userInput.charAt(0) >= '0') && (userInput.charAt(0) <= '9')? DIGITS : LETTERS;
    }
}
