package level1.lesson3;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println(WeekDay.MONDAY);
                break;
            case 2:
                System.out.println(WeekDay.TUESDAY);
                break;
            case 3:
                System.out.println(WeekDay.WEDNESDAY);
                break;
            case 4:
                System.out.println(WeekDay.THURSDAY);
                break;
            case 5:
                System.out.println(WeekDay.FRIDAY);
                break;
            case 6:
                System.out.println(WeekDay.SATURDAY);
                break;
            case 7:
                System.out.println(WeekDay.SUNDAY);
                break;
        }
    }
}
