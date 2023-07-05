import model.Actor;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please provide actor's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please provide actor's last name: ");
        String lastName = scanner.nextLine();

        Actor actor = new Actor(firstName, lastName);

        System.out.println(actor);




    }
}
