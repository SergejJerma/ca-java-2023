package org.codeacademy.test;

import org.codeacademy.test.exam.ExamDao;
import org.codeacademy.test.exam.QuestionDao;
import org.codeacademy.test.ui.TeacherUi;
import org.codeacademy.test.user.User;
import org.codeacademy.test.user.UserDao;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Session session = createSession();
        Initializer.initialize(session);

        UserDao userDao = new UserDao(session);
        QuestionDao questionDao = new QuestionDao(session);
        ExamDao examQuestionDao = new ExamDao(session);

        User user = new User();//login(userDao);
        //User user = login(userDao);
        user.setTeacher(true);

        if (user.isTeacher()) {
            TeacherUi teacherUi = new TeacherUi(scanner);
            teacherUi.setQuestionDao(questionDao);
            teacherUi.setExamQuestionDao(examQuestionDao);
            teacherUi.setUserDao(userDao);
            teacherUi.run(user);
        }

    }



    private static Session createSession() {
        Configuration cfg = new Configuration();
        Configuration configuration = cfg.configure();
        SessionFactory factory = configuration.buildSessionFactory();   //At this row create-drop functionality is executed (hibernate.hbm2ddl.auto)
        Session session = factory.openSession();
        session.setHibernateFlushMode(FlushMode.ALWAYS);
        return session;
    }

    private static User login(UserDao userDao) {
        while (true) {
            System.out.println("Prasom prisijungti");
            System.out.println("Iveskite vartotojo varda: ");
            String username = scanner.nextLine();
            System.out.println("Iveskite vartotojo slaptazodi: ");
            String password = scanner.nextLine();

            User user = userDao.getUserLogin(username, password);

            if (user != null)
                return user;

            System.out.println("Bad username or password.");
        }
    }
}
