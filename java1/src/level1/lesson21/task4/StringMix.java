package level1.lesson21.task4;

import java.util.Scanner;

public class StringMix {
    private static final StringBuilder sb = new StringBuilder();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter word #1: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter word #2: ");
        String word2 = scanner.nextLine();

        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length())
                sb.append(word1.charAt(i));
            if (i < word2.length())
                sb.append(word2.charAt(i));
        }

        System.out.println("StringMix: " + sb);
    }

}
