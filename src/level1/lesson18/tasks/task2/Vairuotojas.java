package level1.lesson18.tasks.task2;

public class Vairuotojas {

    private String vardas;
    private String automobilis;
    private String valstNr;
    private int rida;

    public Vairuotojas(String vardas, String automobilis, String valstNr, int rida) {
        this.vardas = vardas;
        this.automobilis = automobilis;
        this.valstNr = valstNr;
        this.rida = rida;
    }

    public String asCsvLine() {
        return String.format("%s,%s,%s,%d", vardas, automobilis, valstNr, rida);
    }
}
