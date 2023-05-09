package level1.lesson16.draudimas;

public class MainDraudimas {

    public static void main(String[] args) {
        Draudimas draudimas = new CivDraudimas("Jonas", 200.0, "SSS111", "ES"); //Draudimas tipo objektas

        System.out.println(draudimas.getApdVardas());
        System.out.println(draudimas.getDrSuma());

        System.out.println("********************");

        AutoDraudimas autoDraudimas = (AutoDraudimas) draudimas;

        System.out.println(autoDraudimas.getAutoNr()); //AutoDraudimas tipo objektas
        System.out.println("********************");

        CivDraudimas civDraudimas = (CivDraudimas) draudimas;

        System.out.println(civDraudimas.getGalTeritorija());

    }
}
