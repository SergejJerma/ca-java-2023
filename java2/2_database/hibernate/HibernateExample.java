
import model.Darbuotojas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateExample {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


//        Query<Darbuotojas> query = session.createQuery("FROM  Darbuotojas", Darbuotojas.class);
//
//        List<Darbuotojas> list = query.list();
//        list.forEach(System.out::println);

        Transaction t = session.beginTransaction();

//        Query<Darbuotojas> q = session.createQuery("FROM Darbuotojas D WHERE D.id > 1 ORDER BY D.atlyginimas DESC", Darbuotojas.class);
//        List<Darbuotojas> list = q.list();
//        list.forEach(System.out::println);

//        Query q = session.createQuery("DELETE FROM Darbuotojas WHERE id = 1");
        Query q = session.createQuery("UPDATE  Darbuotojas SET vardas = :naujasVardas WHERE vardas = :senasVardas");

//        q.setParameter("naujasVardas", "Nevardenis");
//        q.setParameter("senasVardas", "Petras");
//        q.executeUpdate();
////
////        Darbuotojas objektas = new Darbuotojas();
////
////        objektas.setVardas("Zigmas");
////        objektas.setPavarde("Petraitis");
////        objektas.setAtlyginimas(2500);
////
////        session.persist(objektas);
////
        q.executeUpdate();
        t.commit();
        session.close();

    }
}
