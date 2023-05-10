package level1.lesson18.lektuvas;

import java.util.Random;

class Lektuvas {

    public void isskleistiVaziuokle() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        try {
            int i = 4 / x;  //ArithmeticException
            if (x == 5) {
                "skrendu".charAt(20);   //StringIndexOutOfBoundsException
            } else {
                int[] masyvas = new int[] {1, 2, 3};
                masyvas[10] = 4;    //ArrayIndexOutOfBoundsException
            }

            System.out.println("vaziuokle sekmingai isskleista");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: važiuoklės išskleisti nepavyko");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("ERROR: važiuoklės išskleisti nepavyko dėl kitos klaidos");
        } catch (RuntimeException e) {
            String klaidosZinute =  e.getMessage();
            String klaidosKlase =  e.getClass().getName();

            System.out.printf("ERROR: važiuoklė neišsiskleidė dėl nežinomos klaidos; klaidosZinute = %s; klaidosKlase = %s%n",
                    klaidosZinute, klaidosKlase);
        } finally {
            System.out.println("Lektuvas skrenda");
        }
    }

}
