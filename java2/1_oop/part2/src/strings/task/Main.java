package strings.task;

/**
 * 41. Write a Java program to remove duplicate characters from a given string that appear in another given string.
 *
 * The given string is: the quick brown fox
 * The given mask string is: queen
 *
 * The new string is:
 * th ick brow fox
 */
public class Main {
    public static void main(String[] args) {

        String result = getResultByCreatingAsManyObjectsAsThereAreCharsInMask("the quick brown fox", "queen");
        System.out.println(result);

        String result2 = getResult("the quick brown fox", "queen");
        System.out.println(result2);

    }

    private static String getResultByCreatingAsManyObjectsAsThereAreCharsInMask(String input, String mask) {
        mask.replace(" ", "");
        for (char c : mask.toCharArray())
            input = input.replace(String.valueOf(c), "");
        return input;
    }

    private static String getResult(String input, String mask) {
        StringBuilder sb = new StringBuilder(input);
        for (char c : mask.toCharArray())
            removeDuplicateChars(sb, c);
        return sb.toString();
    }

    private static void removeDuplicateChars(StringBuilder sb, char c) {
        int i;
        while ((i = sb.indexOf(String.valueOf(c))) > -1) {
            sb.deleteCharAt(i);
        }
    }
}
