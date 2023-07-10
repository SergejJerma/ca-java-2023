package org.codeacademy.test.exam;

import org.hibernate.Session;

public class ExamDao {

    private final Session session;

    public ExamDao(Session session) {
        this.session = session;
    }

    public void save(Exam exam) {
        session.beginTransaction();
        session.persist(exam);
        session.getTransaction().commit();
    }
}
