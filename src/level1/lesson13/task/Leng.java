package level1.lesson13.task;

public class Leng extends Auto {
    private String bagTalpa;

    public Leng(String regData, String spalva) {
        super(regData, spalva);
    }


    @Override
    void vaziuoti() {
        System.out.println("Leng vaz");
    }
}