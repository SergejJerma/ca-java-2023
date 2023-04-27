package level1.tasks.word_entry;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        boolean continueLoop = true;
        while (continueLoop) {

            String menu =
                    "1 – įvesti žodį – leidžia įvesti žodį, kuris išsaugomas į sąrašą." +
                    "2 – rasti žodį – randa žodį ir atspausdina kelintas jis yra sąraše." +
                    "3 – trinti žodį – paklausia, kokį žodį ištrinti ir jį ištrina." +
                    "4 – išvalyti sąrašą." +
                    "5 – baigti programą";
            System.out.println("Iveskite komanda:\n" + menu);

            String command = scanner.nextLine().trim();

            switch (command) {
                case "1":
                    System.out.println("Iveskite zodi issaugojimui i sarasa");
                    String wordToAdd = scanner.nextLine().trim();
                    words.add(wordToAdd);
                    break;
                case "2":
                    System.out.println("Iveskite zodi paieskai sarase");
                    String wordToFind = scanner.nextLine().trim();
                    int index = words.indexOf(wordToFind);
                    System.out.println(index);
                    break;
                case "3":
                    System.out.println("Iveskite zodi trynimui is saraso");
                    String wordToRemove = scanner.nextLine().trim();
                    words.remove(wordToRemove);
                    break;
                case "4":
                    words.clear();
                    System.out.println("Sarasas istrintas");
                    break;
                case "5":
                    System.out.println("Ate!");
                    return;
                default:
                    System.out.println("Nevalidi komanda!");
                    break;
            }

            System.out.println("Zodziai sarase:\n" + words);

        }
    }
}
