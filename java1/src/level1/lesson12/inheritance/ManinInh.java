package level1.lesson12.inheritance;

public class ManinInh {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fieldA);
        a.method();

        System.out.println("................");

        A b = new B();
        System.out.println(b.fieldA);
        b.method();

        System.out.println("................");
        B b1 = new B();
        System.out.println(b1.fieldA);
        b1.method();
        b1.methodB();
        System.out.println("................");
        System.out.println(b);


    }
}
