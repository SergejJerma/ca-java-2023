package level1.lesson16.draudimas;

public class Draudimas {
    private String apdVardas;
    private Double drSuma;

    public Draudimas(String apdVardas, Double drSuma) {
        this.apdVardas = apdVardas;
        this.drSuma = drSuma;
    }

    public String getApdVardas() {
        return apdVardas;
    }

    public void setApdVardas(String apdVardas) {
        this.apdVardas = apdVardas;
    }

    public Double getDrSuma() {
        return drSuma;
    }

    public void setDrSuma(Double drSuma) {
        this.drSuma = drSuma;
    }
}
