
import model.Darbas;
import model.Darbuotojas;
import model.Irankis;
import model.Miestas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Darbuotojas darbuotojas = new Darbuotojas("Vardenis", "Pavardenis");

        Irankis irankis = new Irankis("Atsuktuvas");

        Darbas darbas = new Darbas("Statybininkas");

        Miestas miestas = new Miestas("Vilnius");


        darbuotojas.setIrankis(irankis);
        irankis.setDarbuotojas(darbuotojas);

        darbuotojas.getDarbai().add(darbas);
        darbas.setDarbuotojas(darbuotojas);

        darbuotojas.getMiestai().add(miestas);
        miestas.getDarbuotojai().add(darbuotojas);

        session.persist(darbuotojas);

        t.commit();
        session.close();

    }
}
