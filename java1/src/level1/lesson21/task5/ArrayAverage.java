package level1.lesson21.task5;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array of numbers (like [1, 2, 3]): ");
        String userInput = sc.nextLine();
        validateUserInput(userInput);

        String[] inputArray = userInput.split(", ");
        int[] numbers = toArrayOfNumbers(inputArray);
        int average = getAverage(numbers);
        System.out.println("average = " + average);
    }

    private static void validateUserInput(String userInput) {
        if (userInput.isBlank())
            throw new IllegalArgumentException("Input cannot be blank");
    }

    private static int[] toArrayOfNumbers(String[] inputArray) {
        int[] integers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++)
            integers[i] = Integer.parseInt(inputArray[i]);
        return integers;
    }

    private static int getAverage(int[] numbers) {
        if (numbers.length == 0)
            return 0;
        int sum = 0;
        for (int digit : numbers)
            sum += digit;
        return sum / numbers.length;
    }
}
