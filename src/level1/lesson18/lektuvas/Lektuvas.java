package level1.lesson18.lektuvas;

import java.util.Random;

class Lektuvas {
    public void isskleistiVaziuokle() {
        try {
            vaziuokle();
            System.out.println("OK: vaziuokle sekmingai isskleista");
        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println("ERROR: nepavyko isskleisti vaziuokles. Priezastis: " + e.getPriezastis());
        }
    }

    void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int x = rand.nextInt(10);
        switch (x) {
            case 0:
                throw new VaziuoklesIsskleidimoKlaida("Neatsidare durys");
            case 1:
                throw new VaziuoklesIsskleidimoKlaida("Nenusileido ratas");
            case 2:
                throw new VaziuoklesIsskleidimoKlaida("Per didelis aukstis");
        }
    }

}
