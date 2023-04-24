package level1.lesson7;

import java.time.LocalDate;

public class DateCompare {
    public static void main(String[] args) {
        LocalDate zalgirioMusis = LocalDate.of(1410, 12, 31);
        LocalDate saulesMusis = LocalDate.of(1410, 12, 20);

        int compareToRezultatas = zalgirioMusis.compareTo(saulesMusis);

        if (compareToRezultatas > 0) {
            System.out.println(compareToRezultatas);
            System.out.println("Zalgirio musis ivyko veliau");
        } else if (compareToRezultatas == 0) {
            System.out.println(compareToRezultatas);
            System.out.println("Abu musiai vyko tuo paciu metu");
        } else {
            System.out.println(compareToRezultatas);
            System.out.println("Zalgirio musis ivyko anksciau");
        }
    }
}
