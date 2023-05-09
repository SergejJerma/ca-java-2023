package level1.lesson16.draudimas;

public class AutoDraudimas extends Draudimas{

    private String autoNr;

    public AutoDraudimas(String apdVardas, Double drSuma, String autoNr) {
        super(apdVardas, drSuma);
        this.autoNr = autoNr;
    }

    public String getAutoNr() {
        return autoNr;
    }

    public void setAutoNr(String autoNr) {
        this.autoNr = autoNr;
    }
}
