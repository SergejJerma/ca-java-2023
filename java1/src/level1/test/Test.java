package level1.test;

public class Test {

    int a = 10;

    void method() {
        int a = 20;
        System.out.println(a);
        System.out.println(this.a);
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.method();
    }
}
