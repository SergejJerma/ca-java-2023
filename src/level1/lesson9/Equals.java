package level1.lesson9;

public class Equals {
    public static void main(String[] args) {
        comparePrimitives();
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
