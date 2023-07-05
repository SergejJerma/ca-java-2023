import model.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final Session session = getSession();

        Actor actor = getActorFirstAndLastName();
        List<Actor> actors = listActorsByFirstAndLastName(session, actor);
        System.out.println(actors);

        session.close();
    }

    private static List<Actor> listActorsByFirstAndLastName(Session session, Actor actor) {
        return session.createQuery("FROM Actor A where A.firstName = :firstName and A.lastName = :lastName", Actor.class)
                .setParameter("firstName", actor.getFirstName())
                .setParameter("lastName", actor.getLastName())
                .list();
    }

    private static Session getSession() {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();
        return factory.openSession();
    }

    private static Actor getActorFirstAndLastName() {
        System.out.println("Please provide actor's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please provide actor's last name: ");
        String lastName = scanner.nextLine();

        Actor actor = new Actor(firstName, lastName);
        System.out.println(actor);

        return actor;
    }
}
