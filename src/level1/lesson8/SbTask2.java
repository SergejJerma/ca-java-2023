package level1.lesson8;

import java.util.Scanner;

public class SbTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word or number: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        if (str.equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " isn't a palindrome");
        }
        sc.close();
    }
}
