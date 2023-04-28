package level1.lesson12.inheritance;

/**
 * ImonesXDarbuotojas paveldi bruozus is Darbuotojas;
 * Darbuotojas paveldi bruozus is Asmuo
 *
 * Vadinama (sinonimai):
 * - paveldinti klase
 * - isvestine klase (angl. derived class)
 * - vaikine klase (angl. child class)
 * - sub klase (angl. sub class).
 **/
class ImonesXDarbuotojas extends Darbuotojas {
    protected String xNr;

    public ImonesXDarbuotojas(String vardas, String pavarde, String asmensKodas, String socDraudimoNr, String xNr) {
        super(vardas, pavarde, asmensKodas, socDraudimoNr);
        this.xNr = xNr;
    }

    public ImonesXDarbuotojas(Darbuotojas d, String xNr) {
        super(d);
        this.xNr = xNr;
    }

    public String getxNr() {
        return xNr;
    }

    public void setxNr(String xNr) {
        this.xNr = xNr;
    }
    //...konstruktorius/getteriai/setteriai...
}
