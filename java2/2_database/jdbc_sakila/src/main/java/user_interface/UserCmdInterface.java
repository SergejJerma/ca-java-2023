package user_interface;

import model.Actor;

import java.util.Scanner;

public class UserCmdInterface implements UserInterface {

    private final Scanner scanner = new Scanner(System.in);

    public Actor getActorFirstAndLastName() {
        System.out.println("Please provide actor's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please provide actor's last name: ");
        String lastName = scanner.nextLine();

        Actor actor = new Actor(firstName, lastName);
        System.out.println(actor);

        return actor;
    }
}
