package level1.lesson12.inheritance;

/**
 * Studentas paveldi bruozus is Asmuo
 *
 * Vadinama (sinonimai):
 * - paveldinti klase
 * - isvestine klase (angl. derived class)
 * - vaikine klase (angl. child class)
 * - sub klase (angl. sub class).
 **/
class Studentas extends Asmuo {
    protected String studentoPazymejimoNr;

    public Studentas(String studentoPazymejimoNr, String vardas, String pavarde, String asmensKodas) {
        super(vardas, pavarde, asmensKodas);
        this.studentoPazymejimoNr = studentoPazymejimoNr;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
        System.out.println("keiciamas asmens vardas");
    }

    public String getStudentoPazymejimoNr() {
        return studentoPazymejimoNr;
    }

    public void setStudentoPazymejimoNr(String studentoPazymejimoNr) {
        this.studentoPazymejimoNr = studentoPazymejimoNr;
    }
}
