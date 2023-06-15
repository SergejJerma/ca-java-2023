import java.util.List;

public class Main {
    public static void main(String[] args) {
        //raw types (not recommended)
        Calculator calculator = new Calculator(1, 5.9f);

        System.out.println(calculator.sum());
        System.out.println(calculator.sum(1, 5.9f));
        //System.out.println(calculator.sum("1", "5.9f"));  //calculator.sum only accepts subtypes of Number

        calculator.printList(List.of(1, 2.5f, 3.4d, -4, 5.7f));

        //type checking
        //Calculator<Integer> integerCalculator = new Calculator<>(1, 2.0); //compile time error
        Calculator<Integer> integerCalculator = new Calculator<>(1, 2);



    }
}
