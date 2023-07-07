package org.codeacademy.test;

import jakarta.persistence.EntityManager;
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

        login(userDao);

    }



    private static Session createSession() {

        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();
        Session session = factory.openSession();
        session.setHibernateFlushMode(FlushMode.ALWAYS);
        return session;
    }

    private static void login(UserDao userDao) {
        System.out.println("Iveskite vartotojo varda: ");
        String username = scanner.nextLine();
        System.out.println("Iveskite vartotojo slaptazodi: ");
        String password = scanner.nextLine();

        User user = userDao.getUserLogin(username, password);
        System.out.println(user);

    }
}
