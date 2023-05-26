package task2;

import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);

    public String requestUserInput() {
        System.out.println("Type something on an old phone keyboard: ");
        return scanner.nextLine();
    }
}
