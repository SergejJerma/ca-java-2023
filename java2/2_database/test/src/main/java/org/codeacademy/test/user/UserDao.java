package org.codeacademy.test.user;

import de.rtner.security.auth.spi.SimplePBKDF2;
import org.hibernate.Session;

import java.util.List;

/**
 * Data Access Object (DAO) for the User entity
 * For more information on DAO pattern, see:
 * https://www.digitalocean.com/community/tutorials/dao-design-pattern
 * https://www.baeldung.com/java-dao-pattern
 */
public class UserDao {

    private final Session session;
    private final SimplePBKDF2 passwordEncoder = new SimplePBKDF2();

    public UserDao(Session session) {
        this.session = session;
    }

    public User getUserLogin(String username, String password) {
        // get user by username
        User user = session.createQuery("from User where username=:username", User.class)
                .setParameter("username", username)
                .getSingleResultOrNull();

        if (user == null)
            return null;    //no user has such username

        // check password
        boolean passwordCorrect = new SimplePBKDF2().verifyKeyFormatted(user.getPassword(), password);

        if (passwordCorrect)
            return user;

        return null;
    }

    public User getUserById(int id) {
        return session.get(User.class, id);
    }

    public void saveNewUser(User user) {
        // Salt 8 bytes SHA1PRNG, HmacSHA1, 1000 iterations, ISO-8859-1
        String passwordHash = passwordEncoder.deriveKeyFormatted(user.getPassword());
        user.setPassword(passwordHash);
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
