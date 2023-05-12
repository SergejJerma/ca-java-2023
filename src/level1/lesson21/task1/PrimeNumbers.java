package level1.lesson21.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getNumber();
        int b = getNumber();

        //same as List <Integer> primes = getPrimes(a, b);
        var primes = getPrimes(a, b);

        System.out.println("primes.size()" + primes.size());
    }

    private static int getNumber() {
        while (true) {
            System.out.println("Enter a number (or X to close program): ");

            String numberStr = scanner.nextLine();
            if (numberStr.equalsIgnoreCase("X"))
                System.exit(0);

            try {
                return Integer.parseInt(numberStr);
            } catch (NumberFormatException e) {
                System.out.println("It's not a number!");
            }
        }
    }

    private static List<Integer> getPrimes(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        List<Integer> primes = new ArrayList<>();

        for (int i = start; i < end; i++)
            if (isPrime(i)) {
                System.out.println(i);
                primes.add(i);
            }

        return primes;
    }

    private static boolean isPrime(int number) {
        if (number < 2)
            return false;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++)
            if (number % i == 0)
                return false;
        return true;
    }

}
