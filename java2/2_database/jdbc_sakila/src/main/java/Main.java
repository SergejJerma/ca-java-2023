import dao.ActorDao;
import model.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import user_interface.UserCmdInterface;
import user_interface.UserInterface;

import java.util.List;

public class Main {

    private static final UserInterface userInterface = new UserCmdInterface();

    public static void main(String[] args) {

        final Session session = getSession();
        final ActorDao actorDao = new ActorDao(session);

        Actor actor = userInterface.getActorFirstAndLastName();
        List<Actor> actors = actorDao.listActorsByFirstAndLastName(actor.getFirstName(), actor.getLastName());
        System.out.println(actors);

        session.close();
    }

    private static Session getSession() {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();
        return factory.openSession();
    }
}
