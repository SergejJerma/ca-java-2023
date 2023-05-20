package level1.lesson15.constructor;

public class Konstruktoriai {

    public static void main(String[] args) {

        B b = new B(4);

    }

}

class A {

    int x;

    A() {
        System.out.println("iskviestas be parametru");
    }

    A(int paramX) {
        x = paramX;
        System.out.println("iskviestas su parametru");
    }

}

class B extends A {
    B(int x) {
        super(x);
    }

    B() {
    }
}