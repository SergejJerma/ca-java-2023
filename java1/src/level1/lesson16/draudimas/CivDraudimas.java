package level1.lesson16.draudimas;

public class CivDraudimas extends AutoDraudimas{
    private String galTeritorija;

    public CivDraudimas(String apdVardas, Double drSuma, String autoNr, String galTeritorija) {
        super(apdVardas, drSuma, autoNr);
        this.galTeritorija = galTeritorija;
    }

    public String getGalTeritorija() {
        return galTeritorija;
    }

    public void setGalTeritorija(String galTeritorija) {
        this.galTeritorija = galTeritorija;
    }
}
