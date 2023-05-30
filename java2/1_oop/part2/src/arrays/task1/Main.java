package arrays.task1;

import java.util.Scanner;

public class Main {

    //declare and assign array values (initialize) in one line
    static String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //initDaysOfWeek();
        String dayOfWeekStr;
        int dayOfWeekNr;
        do {
            System.out.println("Which day of the week is it?: ");
            dayOfWeekStr = scanner.nextLine();
            dayOfWeekNr = toDayOfWeek(dayOfWeekStr);
        } while (dayOfWeekNr < 1);
        System.out.println(dayOfWeekStr + " is the #" + dayOfWeekNr + " day of the week.");
    }

    // declare and then assign values to the array
    private static void initDaysOfWeek() {
        DAYS_OF_WEEK = new String[7];
        DAYS_OF_WEEK[0] = "Monday";
        DAYS_OF_WEEK[1] = "Tuesday";
        DAYS_OF_WEEK[2] = "Wednesday";
        DAYS_OF_WEEK[3] = "Thursday";
        DAYS_OF_WEEK[4] = "Friday";
        DAYS_OF_WEEK[5] = "Saturday";
        DAYS_OF_WEEK[6] = "Sunday";
    }

    private static int toDayOfWeek(String dayOfWeek) {
        for (int i = 0; i < DAYS_OF_WEEK.length; i++)
            if (dayOfWeek.equalsIgnoreCase(DAYS_OF_WEEK[i]))
                return i + 1;
        return -1;
    }
}

