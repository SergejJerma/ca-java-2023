package level1.tasks;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");

        int number = sc.nextInt();

        int reverse = 0;

        System.out.println("The reverse of the given number is:" + reverseNumber(number, reverse));
    }

    private static int reverseNumber(int number, int reverse) {
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }
        return reverse;
    }
}
