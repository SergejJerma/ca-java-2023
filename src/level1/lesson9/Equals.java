package level1.lesson9;

public class Equals {


    public static void main(String[] args) {
        //comparePrimitives();

        compareObjects();

    }

    private static void compareObjects() {
        String a = new String("Namas");
        String b = new String("Namas");
        String c = new String("Miestas");

        System.out.println(a == b); // false
        System.out.println(a == c); // false
        System.out.println(b == c); // false
    }

    private static void comparePrimitives() {
        double a = 1000;
        double b = 1000;
        double c = 999;

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(b == c); // false
    }
}
