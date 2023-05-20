package pass_by_ref;

public class Asmuo {
    protected String vardas;
    protected String pavarde;
    protected String asmensKodas;

    public Asmuo(String vardas, String pavarde, String asmensKodas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
}
