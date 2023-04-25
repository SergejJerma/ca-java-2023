package level1.lesson7.test.q19;

public class Testas {
    private TestB b;
    static int i = 19;

    static void mazink() {
        i--;
    }

    public static void main(String[] args) {
        mazink();
        mazink();
        System.out.println(i);
    }
}

class TestB {

}