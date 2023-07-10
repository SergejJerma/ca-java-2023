package org.codeacademy.test.model;

import org.hibernate.Session;

import java.util.List;

public class QuestionDao {

    private final Session session;

    public QuestionDao(Session session) {
        this.session = session;
    }

    public Question getQuestionById(int id) {
        return session.get(Question.class, id);
    }

    public void save(Question question) {
        session.beginTransaction();
        session.persist(question);
        session.getTransaction().commit();
    }

    public List<Question> findAll() {
        return session.createQuery("from Question", Question.class).getResultList();
    }

    public void deleteById(int id) {
        session.beginTransaction();
        session.createMutationQuery("delete Question where id = :id")
                .setParameter("id", id)
                .executeUpdate();
        session.getTransaction().commit();
    }
}
