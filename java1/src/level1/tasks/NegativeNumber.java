package level1.tasks;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int skaicius = 1;

        while (skaicius > 0) { // true
            System.out.print("Iveskite skaiciu:");
            skaicius = sc.nextInt();
        }
        sc.close();
    }
}
