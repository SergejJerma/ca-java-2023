package level1.biudzetas;

public class IslaiduIrasas extends Irasas {

    private String islaiduKategorija;
    private String islaiduTipas;
    public static final String ISLAIDU_KATEGORIJA = "I";

    public String getIslaiduKategorija() {
        return islaiduKategorija;
    }

    public void setIslaiduKategorija(String islaiduKategorija) {
        this.islaiduKategorija = islaiduKategorija;
    }

    public String getIslaiduTipas() {
        return islaiduTipas;
    }

    public void setIslaiduTipas(String islaiduTipas) {
        this.islaiduTipas = islaiduTipas;
    }

    public String toString() {
        return String.format("Islaidu iraso ID: %d \nIslaidu suma: %.2f \nKomentaras: %s \nData: %s \nIslaidu tipas: %s \n",
                id, suma, komentaras, laikas, islaiduTipas);
    }

}