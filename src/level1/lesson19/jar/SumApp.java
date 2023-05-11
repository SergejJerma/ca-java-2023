package level1.lesson19.jar;

public class SumApp {

    public static void main(String[] args) {

        if (args.length >= 2) {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int result = SumService.getSumOf(number1, number2);
            System.out.println("Sum: " + result);
        }

    }

}
