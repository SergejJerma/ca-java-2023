package level1.tasks;

import java.util.Arrays;

public class Pavyzdys { //https://lietuvai.lt/wiki/Burbulo_rikiavimo_algoritmas


    public static void main(String[] args) {
        int[] duomenys = {5, 8, 1, 4, 3};
        int ilgis = 5;

        System.out.println("nesurusiuotas>>>>" + Arrays.toString(duomenys));

        Pavyzdys.rikiuotiBurbuliuku(duomenys, ilgis);

        System.out.println("surusiuotas>>>>" + Arrays.toString(duomenys));
    }

    public static void rikiuotiBurbuliuku(int[] duomenys, int ilgis) {
        boolean testi = true;

        int pask = ilgis - 1;

        while (testi) {
            testi = false;

            for (int i = 0; i < pask; ++i) {
                if (duomenys[i] > duomenys[i + 1]) {
                    int laikinas = duomenys[i];

                    duomenys[i] = duomenys[i + 1];
                    duomenys[i + 1] = laikinas;
                    testi = true;
                }
            }
            --pask;
        }
    }
}