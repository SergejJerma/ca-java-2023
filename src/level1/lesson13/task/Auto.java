package level1.lesson13.task;

abstract public class Auto {
     String regData;
     String spalva;

    public Auto(String regData, String spalva) {
        this.regData = regData;
        this.spalva = spalva;
    }

    public String getRegData() {
        return regData;
    }

    abstract void vaziuoti();

    @Override
    public String toString() {
        return "Auto{" +
                "regData='" + regData + '\'' +
                ", spalva='" + spalva + '\'' +
                '}';
    }
}
