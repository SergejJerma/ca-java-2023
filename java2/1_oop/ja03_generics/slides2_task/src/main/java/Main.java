public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 5.9f));
        System.out.println(calculator.sum(Integer.valueOf(1), Float.valueOf(5.9f)));
        //System.out.println(calculator.sum("1", "5.9f"));  //calculator.sum only accepts subtypes of Number
    }
}
