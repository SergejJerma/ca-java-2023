package org.codeacademy.test.user;

import org.codeacademy.test.exam.Question;
import org.hibernate.Session;

/**
 * Data Access Object (DAO) for the User entity
 * For more information on DAO pattern, see:
 * https://www.digitalocean.com/community/tutorials/dao-design-pattern
 * https://www.baeldung.com/java-dao-pattern
 */
public class UserDao {

    private final Session session;

    public UserDao(Session session) {
        this.session = session;
    }

    public User getUserLogin(String username, String password) {
        return session.createQuery("from User where username=:username and password=:password", User.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getSingleResultOrNull();
    }

    public User getUserById(int id) {
        return session.get(User.class, id);
    }
}
