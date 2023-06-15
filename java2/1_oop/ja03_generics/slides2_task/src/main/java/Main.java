public class Main {
    public static void main(String[] args) {
        //raw types (not recommended)
        Calculator calculator = new Calculator(1, 5.9f);

        System.out.println(calculator.sum());
        System.out.println(calculator.sum(1, 5.9f));
        //System.out.println(calculator.sum("1", "5.9f"));  //calculator.sum only accepts subtypes of Number


        //type checking
        //Calculator<Integer> integerCalculator = new Calculator<>(1, 2.0); //compile time error
        Calculator<Integer> integerCalculator = new Calculator<>(1, 2);


    }
}
