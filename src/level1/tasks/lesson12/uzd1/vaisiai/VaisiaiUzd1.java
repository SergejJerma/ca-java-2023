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

        System.out.println("Ar lietuviskasVaisius yra instanceOf LietuviskasVaisius? ");
        testInstanceOf(lietuviskasVaisius);

        System.out.println("Ar ananasas yra instanceOf LietuviskasVaisius? ");
        testInstanceOf(ananasas);

        System.out.println("Ar kriause yra instanceOf LietuviskasVaisius? ");
        testInstanceOf(kriause);
    }

    public static void testInstanceOf(Vaisius vaisius) {
        System.out.println(vaisius.getClass().getSimpleName() + " yra LietuviskasVaisius: " + (vaisius instanceof LietuviskasVaisius));
        System.out.println("Vaisius yra Object: " + (vaisius instanceof Object));
        System.out.println();
    }
}
