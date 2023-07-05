package dao;

import model.Actor;
import org.hibernate.Session;

import java.util.List;

/* Data Access Object for Actor class
* https://www.baeldung.com/java-dao-pattern
*   */
public class ActorDao {

    private final Session session;

    public ActorDao(Session session) {
        this.session = session;
    }

    public List<Actor> listActorsByFirstNameLikeAndLastNameLike(String firstName, String lastName) {
        return session.createQuery("FROM Actor A where A.firstName like :firstName and A.lastName like :lastName", Actor.class)
                .setParameter("firstName", firstName)
                .setParameter("lastName", lastName)
                .list();
    }
}
