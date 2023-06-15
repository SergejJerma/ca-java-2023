public  class Calculator <T extends Number> {

    private T varA;
    private T varB;

    public Calculator(T varA, T varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public  Number sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public  Number sum() {
        return varA.doubleValue() + varB.doubleValue();
    }
}
