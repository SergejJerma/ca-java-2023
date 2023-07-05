package user_interface;

import model.Actor;

public interface UserInterface {
    Actor getActorFirstAndLastName();

    Command getMenuItem();
}
