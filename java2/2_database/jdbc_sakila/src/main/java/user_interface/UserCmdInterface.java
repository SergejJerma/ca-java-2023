package user_interface;

import model.Actor;

import java.util.Scanner;

import static user_interface.Command.INVALID;

public class UserCmdInterface implements UserInterface {

    private final Scanner scanner = new Scanner(System.in);

    public Actor getActorFirstAndLastName() {
        System.out.println("Please provide actor's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please provide actor's last name: ");
        String lastName = scanner.nextLine();

        return new Actor(firstName, lastName);
    }

    @Override
    public Command getMenuItem() {
        do {
            System.out.println("\nPlease select an option: ");
            System.out.println("[L] List actors by first and last name");
            System.out.println("[Q] Quit");
            Command command = readUserCommand();
            if (command != INVALID)
                return command;
        } while (true);
    }

    private Command readUserCommand() {
        String optionStr = scanner.nextLine();
        return Command.get(optionStr);
    }
}
