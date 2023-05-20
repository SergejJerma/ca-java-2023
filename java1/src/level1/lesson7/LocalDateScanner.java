package level1.lesson7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time: ");
        String timeInput = scanner.next();
        System.out.println(timeInput);
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");
        LocalTime time = LocalTime.parse(timeInput, formatter);

        LocalTime timePlus = time.plusHours(2).plusMinutes(15);

        System.out.println("formatted time +2h 15min: " + timePlus);

        System.out.println("input time isBefore? " + timePlus.isBefore(LocalTime.now()));

//        String timeString = time.format(formatter);
//        System.out.println("formatted time to String: " + timeString);

//        LocalDate zalgirioMusis = LocalDate.of(1410, 7, 15);
//        LocalDate saulesMusis = LocalDate.of(1236, 9, 22);
//
//        if (zalgirioMusis.isBefore(saulesMusis)) {
//            System.out.println("Zalgirio musis ivyko anksciau");
//        }
//
//        if (zalgirioMusis.isAfter(saulesMusis)) {
//            System.out.println("Zalgirio musis ivyko veliau");
//        }
//
//        LocalDate date1 = LocalDate.of(1410, 7, 15);
//        LocalDate date2 = LocalDate.of(1410, 7, 15);
//
//        System.out.println(date1.isBefore(date2));
    }
}
