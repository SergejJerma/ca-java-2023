package level1.lesson7.test.q3;

class A {
    B b;

    public A() {
        b = new B();
        System.out.println("A");
    }

    public static void main(String[] args) {
        new A();
        new B();
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}
