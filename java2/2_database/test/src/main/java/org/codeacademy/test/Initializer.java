package org.codeacademy.test;

import org.codeacademy.test.user.User;
import org.hibernate.Session;

public class Initializer {

    public static void initialize(Session session) {
        session.beginTransaction();

        session.createQuery("delete from User")
                .executeUpdate();

        User teacher = new User();
        teacher.setUsername("teacher");
        teacher.setPassword("password");
        teacher.setTeacher(true);

        session.persist(teacher);

        User student = new User();
        student.setUsername("user");
        student.setPassword("password");

        session.persist(student);
        session.getTransaction().commit();
    }
}
