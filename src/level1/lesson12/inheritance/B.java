package level1.lesson12.inheritance;

public class B extends A {

    String fieldA = "B class field";

    public void methodB() {
        System.out.println("B class method");
    }

    @Override
    public void method() {
        System.out.println("Override in B class");
    }

    @Override
    public String toString() {
        return "B{" +
                "field='" + fieldA + '\'' +
                '}';
    }
}
