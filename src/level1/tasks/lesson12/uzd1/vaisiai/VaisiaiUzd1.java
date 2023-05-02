package level1.tasks.lesson12.uzd1.vaisiai;

public class VaisiaiUzd1 {
    public static void main(String[] args) {
        Vaisius vaisius = new Vaisius();
        vaisius.kasAsEsu();

        EgzotinisVaisius egzotinisVaisius = new EgzotinisVaisius();
        egzotinisVaisius.kasAsEsu();

        Ananasas ananasas = new Ananasas();
        ananasas.kasAsEsu();

        Mangas mangas = new Mangas();
        mangas.kasAsEsu();

        LietuviskasVaisius lietuviskasVaisius = new LietuviskasVaisius();
        lietuviskasVaisius.kasAsEsu();

        Kriause kriause = new Kriause();
        kriause.kasAsEsu();

        Obuolys obuolys = new Obuolys();
        obuolys.kasAsEsu(); //LietuviskasVaisius - nes paveldi metoda kasAsEsu() is klases LietuviskasVaisius

        Alyvinis alyvinis = new Alyvinis();
        alyvinis.kasAsEsu();

        Antaninis antaninis = new Antaninis();
        antaninis.kasAsEsu();

    }
}
