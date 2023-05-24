package longest.common.prefix;

import java.util.Scanner;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class Main {

    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        System.out.println("longestCommonPrefix: " + longestCommonPrefix(words1));  // Output: "fl"

        String[] words2 = {"dog", "racecar", "car"};
        System.out.println("longestCommonPrefix: " + longestCommonPrefix(words2));  // Output: ""


        Scanner scanner = new Scanner(System.in);
        System.out.println("provide some words");
        String[] words = scanner.nextLine().split(" ");
        System.out.println("longestCommonPrefix: " + longestCommonPrefix(words));
    }


    public static String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0)
            return "";

        // imam pirma zodi kaip ilgiausia bendra pradzia
        String commonPrefix = words[0];

        // einam per sarasa ir ... (vis trumpiname ilgiausia bendra zodziu pradzia)
        for (int i = 1; i < words.length; i++) {

            // ieskom dalies, sutampancios su zodio pradzia
            boolean isPrefix = false;
            while (!isPrefix) {
                // Tikrinam ar sekantis zodis turi tokia pacia pradzia
                isPrefix = words[i].startsWith(commonPrefix);
                // isPrefix = (words[i].indexOf(commonPrefix) != 0);    //alternatyva

                /* Jeigu sekantis zodis neturi tokios pradzios (jeigu dalis, sutampanti su zodio pradzia yra trumpesne...) */
                if (!isPrefix)
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);  //... tai sekanciame zodyje ieskom trumpesnes dalies
            }

            // Jeigu niekas nesutampa - grazinam "" (tuscia String)
            if (commonPrefix.isEmpty())
                return "";
        }

        return commonPrefix;
    }
}
