package level1.lesson5;

public class Task1 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        System.out.println("first");
        m2();
    }

    public static void m2() {
        System.out.println("second");
        m3();
    }

    public static void m3() {
        System.out.println("third");
    }

    public static void print(String name, String surname, String lang, int monthNumber) {
        System.out.println("Aš, "+ name);
    }
}
