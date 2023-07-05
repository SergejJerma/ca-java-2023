package user_interface;

import lombok.Getter;

@Getter
public enum Command {
    QUIT("Q"),
    INVALID("I"),
    LIST_ACTORS("L");

    private final String id;

    Command(String id) {
        this.id = id;
    }

    public static Command get(String option) {
        for (Command command : Command.values()) {
            if (command.getId().equalsIgnoreCase(option))
                return command;
        }
        return Command.INVALID;
    }
}
