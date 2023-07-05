import dao.ActorDao;
import model.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import user_interface.UserCmdInterface;
import user_interface.UserInterface;

import java.util.List;

public class Main {

    private static final UserInterface ui = new UserCmdInterface();

    public static void main(String[] args) {

        final Session session = getSession();
        final ActorDao actorDao = new ActorDao(session);

        boolean run = true;
        while (run) {
            switch (ui.getMenuItem()) {
                case LIST_ACTORS:
                    Actor actorLike = ui.getActorFirstAndLastName();
                    List<Actor> actors = actorDao
                            .listActorsByFirstNameLikeAndLastNameLike(actorLike.getFirstName(), actorLike.getLastName());
                    System.out.printf("Actors found [%d]: %n", actors.size());
                    actors.forEach(actor -> System.out.printf("\t%s%n", actor));
                    break;
                case QUIT:
                    System.out.println("Bye!");
                    run = false;
                default:
                    break;
            };
        }

        session.close();
    }

    private static Session getSession() {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();
        return factory.openSession();
    }
}
