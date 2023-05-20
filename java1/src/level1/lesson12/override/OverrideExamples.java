package level1.lesson12.override;

import level1.tasks.coordinates.Koordinate;

public class OverrideExamples {
    public static void main(String[] args) {
        Koordinate koordinateOriginali = new Koordinate(1, 2);
        Koordinate koordinateKlonuota = koordinateOriginali.clone();

        System.out.println("Originali koordinate: "
                + koordinateOriginali.getX()
                + "; " + koordinateOriginali.getY());

        System.out.println("Originali  klonuota: " + koordinateKlonuota.getX()
                + "; " + koordinateKlonuota.getY());

        System.out.println("koordinateOriginali == koordinateKlonuota: " +
                (koordinateOriginali == koordinateKlonuota));     //false
        System.out.println("koordinateOriginali.equals(koordinateKlonuota): " +
                koordinateOriginali.equals(koordinateKlonuota));  //true
    }
}
