package level1.lesson15;

public class B extends A {

    Integer i = 1000;

    public B() {
        super();
        System.out.println("B const");
    }

    @Override
    void test() {
        System.out.println("B class");
    }

    void testB() {
        System.out.println("bbbb");
    }

    void testBA(int a) {
        System.out.println("bbbb");
    }

    void testBA(String a, int b, int c) {
        System.out.println("bbbb");
    }

    void testBA(int b, int a, String c) {
        System.out.println("bbbb");
    }
}
