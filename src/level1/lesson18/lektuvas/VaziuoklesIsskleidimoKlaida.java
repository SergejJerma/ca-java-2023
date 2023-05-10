package level1.lesson18.lektuvas;

class VaziuoklesIsskleidimoKlaida extends Exception {
    private String priezastis;
    private String svarbumas = "nežinoma";

    public VaziuoklesIsskleidimoKlaida(String priezastis) {
        this.priezastis = priezastis;
    }

    public VaziuoklesIsskleidimoKlaida(String priezastis, String svarbumas) {
        this.priezastis = priezastis;
        this.svarbumas = svarbumas;
    }

    public String getPriezastis() {
        return priezastis;
    }

    public void setPrizastis(String priezastis) {
        this.priezastis = priezastis;
    }

    public String getSvarbumas() {
        return svarbumas;
    }
}
