package level1.lesson16.draudimas;

public class KaskoDraudimas extends AutoDraudimas{
    private Double francize;

    public KaskoDraudimas(String apdVardas, Double drSuma, String autoNr, Double francize) {
        super(apdVardas, drSuma, autoNr);
        this.francize = francize;
    }

    public Double getFrancize() {
        return francize;
    }

    public void setFrancize(Double francize) {
        this.francize = francize;
    }
}
