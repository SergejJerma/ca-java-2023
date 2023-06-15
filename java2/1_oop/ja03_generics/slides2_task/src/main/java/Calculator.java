public class Calculator {



    public <T extends Number> Number sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
