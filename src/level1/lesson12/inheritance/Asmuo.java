package level1.lesson12.inheritance;

/**
 * Kitos klases paveldi bruozus is Asmuo
 *
 * Vadinama (sinonimai):
 * - tėvine klase (angl. parental class),
 * - bazine klase (angl. base class),
 * - super klase (angl. super class).
 */
public class Asmuo {
    protected String vardas;
    protected String pavarde;
    protected String asmensKodas;

    public Asmuo(String vardas, String pavarde, String asmensKodas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAsmensKodas() {
        return asmensKodas;
    }

    public void setAsmensKodas(String asmensKodas) {
        this.asmensKodas = asmensKodas;
    }
}
