package level1.lesson19.compilation;

public class Test {
    public static void main(String[] args) {
        B objektasB = new B();
        objektasB = null;
        objektasB.metodasB();
    }
}
class B {
    public void metodasB() {
        System.out.println("B");

    }
}
