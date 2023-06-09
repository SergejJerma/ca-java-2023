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

        testIsObjectPaveldimiMetodai(kriause);
    }

    private static void testIsObjectPaveldimiMetodai(Vaisius vaisius) {
        System.out.println("toString: " + vaisius.toString()); //paveldim is Object; bet patys galim Override'inti
        System.out.println("hashCode: " + vaisius.hashCode()); //paveldim is Object; bet patys galim Override'inti
        System.out.println("equals: " + vaisius.equals(vaisius)); //paveldim is Object; bet patys galim Override'inti

//        Vaisius vaisius2 = (Vaisius) vaisius.clone();   //java: clone() has protected access in java.lang.Object
//        System.out.println(vaisius2.toString());
    }

    public static void testInstanceOf(Vaisius vaisius) {
        System.out.println(vaisius.getClass().getSimpleName() + " yra LietuviskasVaisius: " + (vaisius instanceof LietuviskasVaisius));
        System.out.println("Vaisius yra Object: " + (vaisius instanceof Object));

        /*
            Compile time error: ne visi vaisiai turi metoda 'metodasKuriTuriTikLietuviskiVaisiai'
            Java turi buti uztikrinta, kad objektas gali vykdyti kvieciama metoda
        */
        //vaisius.metodasKuriTuriTikLietuviskiVaisiai();
        if (vaisius instanceof LietuviskasVaisius) {
            System.out.println(vaisius.getClass().getSimpleName());
            System.out.println("Hey - cia juk lietuviskas vaisius");
            System.out.println("kad galetume kviest metodasKuriTuriTikLietuviskiVaisiai reikia cast'inti i LietuviskasVaisius");
            LietuviskasVaisius lietuviskasVaisius = (LietuviskasVaisius) vaisius;   //cast'inimas
            lietuviskasVaisius.metodasKuriTuriTikLietuviskiVaisiai();

            //ClassCastException - LietuviskasVaisius cannot be cast to class Alyvinis
            //Alyvinis alyvinis = (Alyvinis) vaisius;
        }
        System.out.println();
    }
}
