public class Calculator {

    public int add(Integer a, Integer b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        return a + b;
    }

    public int multiply(Integer a, Integer b) {
        if (a == null || b == null)
            return 0;
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
