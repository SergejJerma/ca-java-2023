package level1.lesson5;

public class Auto {
    private String pavadinimas;
    private int pagaminimoMetai;
    private float variklioTuris;

    public Auto(String pavadinimas, int pagaminimoMetai, float variklioTuris) {
        this.pavadinimas = pavadinimas;
        this.pagaminimoMetai = pagaminimoMetai;
        this.variklioTuris = variklioTuris;
    }

    public String automobilioDuomenys(float kaina) {


        String rezultatas = "";
        rezultatas += pavadinimas;
        rezultatas += " | ";
        rezultatas += pagaminimoMetai;
        rezultatas += " | ";
        rezultatas += variklioTuris;
        rezultatas += " | ";
        rezultatas += kaina;

        return rezultatas;
    }
}