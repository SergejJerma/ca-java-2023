import model.Actor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Session session = getSession();

        Actor actor = getActorFirstAndLastName();
        List<Actor> actors = listActorsByFirstAndLastName(session, actor);

        System.out.println(actors);

    }

    private static List<Actor> listActorsByFirstAndLastName(Session session, Actor actor) {
        String queryStr = String.format("FROM Actor A where A.firstName = '%s' and A.lastName='%s'",
                actor.getFirstName(),
                actor.getLastName()
        );
        Query<Actor> query = session.createQuery(queryStr, Actor.class);

        List<Actor> actors = query.list();
        return actors;
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
