package org.codeacademy.test;

import org.codeacademy.test.exam.Answer;
import org.codeacademy.test.exam.Question;
import org.codeacademy.test.user.User;
import org.hibernate.Session;

import java.util.List;

public class Initializer {

    public static void initialize(Session session) {
        session.beginTransaction();

        setupUsers(session);
        setupQuestionAndAnswers(session);


        session.getTransaction().commit();
    }

    private static void setupQuestionAndAnswers(Session session) {
        session.createQuery("delete from Question")
                .executeUpdate();

        Question question1 = new Question("Color of the grass");
        Answer answer11 = new Answer("Red");
        Answer answer12 = new Answer("Green", true);
        Answer answer13 = new Answer("Yellow");
        question1.setAnswers(List.of(answer11, answer12, answer13));
        session.persist(question1);

        Question question2 = new Question("Color of the sky");
        Answer answer21 = new Answer("Red");
        Answer answer22 = new Answer("Green");
        Answer answer23 = new Answer("Blue", true);
        question2.setAnswers(List.of(answer21, answer22, answer23));
        session.persist(question2);

    }

    private static void setupUsers(Session session) {
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
    }
}
