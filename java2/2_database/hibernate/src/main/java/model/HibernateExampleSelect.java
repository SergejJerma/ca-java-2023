package model;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import model.*;
import model.Darbuotojas;
import model.Irankis;
import model.Miestas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateExampleSelect {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
//        Transaction t = session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Darbuotojas> cr =  cb.createQuery(Darbuotojas.class);
        Root<Darbuotojas> root = cr.from(Darbuotojas.class);
        cr.select(root).where(cb.like(root.get("vardas"), "%enis%"));

        Query<Darbuotojas> query = session.createQuery(cr);
        List<Darbuotojas> results = query.getResultList();

        results.forEach(System.out::println);

//        t.commit();
        session.close();

    }
}
