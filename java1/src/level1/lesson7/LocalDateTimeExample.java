package level1.lesson7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("day of week " + dateTime.getDayOfWeek());

        System.out.println("+20y " + dateTime.plusYears(20));

        LocalDateTime dateTimePlus20 = dateTime.plusYears(20);

        System.out.println(dateTime);
        System.out.println(dateTimePlus20);
        String dateFormated = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dateFormated);

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy!!MM!!dd");

        String dateFormated1 = dateTime.format(formater);
        System.out.println(dateFormated1);

    }
}
