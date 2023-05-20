package level1.lesson15;

public class MainAB {
    public static void main(String[] args) {

        A b = new B();
        b.test();

        System.out.println("........");

        ((B)b).testB();
    }
}
