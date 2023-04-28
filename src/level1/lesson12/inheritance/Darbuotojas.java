package level1.lesson12.inheritance;

/**
 * Darbuotojas paveldi bruozus is Asmuo
 *
 * Vadinama (sinonimai):
 * - paveldinti klase
 * - isvestine klase (angl. derived class)
 * - vaikine klase (angl. child class)
 * - sub klase (angl. sub class).
 **/
class Darbuotojas extends Asmuo {
    protected String socDraudimoNr;

    public Darbuotojas(String vardas, String pavarde, String asmensKodas, String socDraudimoNr) {
        super(vardas, pavarde, asmensKodas);
        this.socDraudimoNr = socDraudimoNr;
    }

    public Darbuotojas(Darbuotojas d) {
        super(d.vardas, d.pavarde, d.asmensKodas);
        this.socDraudimoNr = d.getSocDraudimoNr();
    }

    public String getSocDraudimoNr() {
        return socDraudimoNr;
    }

    public void setSocDraudimoNr(String socDraudimoNr) {
        this.socDraudimoNr = socDraudimoNr;
    }

    //...konstruktorius/getteriai/setteriai...
}
