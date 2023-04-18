package level1.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite metus");
        int year = sc.nextInt();

        boolean isLeapYear = LeapYear.isLeapYear(year);
        System.out.println(year + " metai keliamieji: " + isLeapYear);

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) { // 1001 % 4 = 1 <****> 1000 / 4 = 250
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}





