package level1.lesson18.lektuvas;

import java.util.Random;

class Lektuvas {
    public void isskleistiVaziuokle() {
        try {
            vaziuokle();
            System.out.println("OK: vaziuokle sekmingai isskleista");
        } catch (LaikinaKlaida e) {
            System.out.printf("ERROR1: nepavyko isskleisti vaziuokles. Priezastis: %s. Svarbumas: %s%n",
                    e.getPriezastis(), e.getSvarbumas());
        } catch (SvarbiKlaida e) {
            System.out.printf("ERROR2: nepavyko isskleisti vaziuokles. Priezastis: %s. Svarbumas: %s%n",
                    e.getPriezastis(), e.getSvarbumas());
        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.printf("ERROR3: nepavyko isskleisti vaziuokles. Priezastis: %s. Svarbumas: %s%n",
                    e.getPriezastis(), e.getSvarbumas());
        }
    }

    void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int x = rand.nextInt(10);
        switch (x) {
            case 0:
                throw new VaziuoklesIsskleidimoKlaida("Neatsidare durys");
            case 1:
                throw new SvarbiKlaida("Nenusileido ratas");
            case 2:
                throw new LaikinaKlaida("Per didelis aukstis");
        }
    }

}
