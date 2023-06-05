import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {

        System.out.println("Enter operand a for operation: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter operand b for operation: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter operation to perform on operands: ");
        String operation = scanner.nextLine();
        switch (operation) {
            case "+":
                System.out.println("result is: " + calculator.add(a, b));
                break;
            case "-":
                System.out.println("result is: " + calculator.subtract(a, b));
                break;
        }
    }
}
