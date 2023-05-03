package level1.lesson13.task;

public class Sunk extends Auto {
    private String maxKrovinioDydis;

    public Sunk(String regData, String spalva) {
        super(regData, spalva);
    }


    @Override
    void vaziuoti(){
        System.out.println("Sunk vaz");
    }

    @Override
    public String toString() {
        return "Sunk{" +
                "regData='" + regData + '\'' +
                ", spalva='" + spalva + '\'' +
                '}';
    }
}
