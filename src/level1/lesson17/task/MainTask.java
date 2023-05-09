package level1.lesson17.task;

public class MainTask {
    public static void main(String[] args) {
        Miestas miestas = new Miestas("Vilnius");
        Adresas adresas = new Adresas(null);
        String pavadinimas = gautiMiestoPavadinima(adresas);
        if (pavadinimas != null) {
            System.out.println(pavadinimas.concat("-sostine"));
        }

        System.out.println(pavadinimas);

    }

    static String gautiMiestoPavadinima(Adresas adresas) {
        if (
                adresas != null
                && adresas.getMiestas() != null
                && adresas.getMiestas().getPavadinimas() != null
        ) {
            String miestoPavadinimas = adresas.getMiestas().getPavadinimas();
            System.out.println(miestoPavadinimas.toUpperCase());
            return miestoPavadinimas;
        }
       return null;
    }
}
