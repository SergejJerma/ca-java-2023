package level1.lesson21.task3;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
    public static void main(String[] args) {
    List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            int digit1 = i / 100;
            int digit2 = i / 10 % 10;
            int digit3 = i % 10;

            if (Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3) == i) {
                System.out.printf("Armstrong number:\n\t%d^3 + %d^3 + %d^3 = %d%n", digit1, digit2, digit3, i);
                armstrongNumbers.add(i);
            }
        }
        System.out.println("armstrongNumbers = " + armstrongNumbers);
    }
}
