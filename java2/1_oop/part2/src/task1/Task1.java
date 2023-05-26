package task1;

import java.util.*;

/**
 * Parašykite programą, kuri suskaidytų įvestą sakinį į atskirus žodžius (tarkime, kad sakinyje
 * nėra skiriamūjų ženklų) ir išvestų rezultatą į ekraną.
 * 1. Tegu programa taip pat išveda ir kiek žodžių yra sakinyje.
 * 2. Išvedamus žodžius pradėtų didžiąja raide.
 * 3. Žodžius išvesdinėtų ne jų pasirodymo tvarka, o pagal abėcėlę.
 * 4. Tegu programa suskaičiuoja, kiek unikalių žodžių yra sakinyje.
 *
 */
public class Task1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String sentence = requestSentenceInput();
        System.out.println("User entered a sentence: " + sentence);

        String[] words = sentence.split(" ");
        System.out.println("Sentene split into words: " + Arrays.toString(words));

        System.out.println("Sentence contains " + words.length + " words");

        String[] wordsInUpperCase = getWordsInUpperCase(words);
        System.out.println("Words in upper case: " + Arrays.toString(wordsInUpperCase));

        Arrays.sort(wordsInUpperCase);
        System.out.println("Words in upper case sorted: " + Arrays.toString(wordsInUpperCase));

        int uniqueWordsCount = new HashSet<>(List.of(wordsInUpperCase)).size();
        System.out.println("Number of unique words: " + uniqueWordsCount);

    }

    private static String[] getWordsInUpperCase(String[] words) {
        String[] wordsInUpperCase = new String[words.length];
        for (int i = 0; i < words.length; i++)
            wordsInUpperCase[i] = wordToUpperCase(words[i]);
        return wordsInUpperCase;
    }

    private static String wordToUpperCase(String word) {
        String firstLetterStr = Character.toString(word.charAt(0)).toUpperCase();
        return firstLetterStr + word.substring(1);
    }

    private static String requestSentenceInput() {
        System.out.println("Enter a sentence: ");
        return scanner.nextLine();
    }


}
