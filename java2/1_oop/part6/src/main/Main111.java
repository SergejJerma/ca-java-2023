import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {

    double getSuma(int a, int b);
}

public class Main111 {

    public static void main(String[] args) {


        MyInterface ref = (a, b) -> a * b;

        System.out.println("Value of Pi = " + ref.getSuma(2, 3));
    }

}