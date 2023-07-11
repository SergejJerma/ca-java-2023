package org.codeacademy.test.user;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

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

    public void save(User user) {
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
    }

    public List<User> findAllByTeacher(boolean isTeacher) {
        return session.createQuery("from User where teacher=:isTeacher", User.class)
                .setParameter("isTeacher", isTeacher)
                .getResultList();
    }
}
