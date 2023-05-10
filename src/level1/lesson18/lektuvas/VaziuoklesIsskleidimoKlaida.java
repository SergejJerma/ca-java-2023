package level1.lesson18.lektuvas;

class VaziuoklesIsskleidimoKlaida extends Exception {
    private String priezastis;

    public VaziuoklesIsskleidimoKlaida(String priezastis) {
        this.priezastis = priezastis;
    }

    public String getPriezastis() {
        return priezastis;
    }

    public void setPrizastis(String priezastis) {
        this.priezastis = priezastis;
    }

}
