package constructors_task2;

/**
 * Static final: užduotis 2
 *
 * Sukurti klasę StaticTestFinal su dviem static kintamaisiais.
 * Klasė taip pat turi turėti metodą priskirk, kuriame kintamiesiems priskiriamos perduotos reikšmės
 * ir išspausdina objekto kintamųjų reikšmes.
 * Main metode sukurti keletą StaticTestFinal objektų ir jiems iškviesti metodą priskirk
 * Paskelbti vieną iš kintamųjų final
 */
public class Main {
    public static void main(String[] args) {
        StaticTestFinal obj1 = new StaticTestFinal();
        StaticTestFinal obj2 = new StaticTestFinal();

        obj1.priskirk(1, 2);
        obj2.priskirk(3, 4);

    }
}

class StaticTestFinal {
    static /*final*/ int prop1;
    static int prop2;

    public void priskirk(int prop1, int prop2) {
        this.prop1 = prop1;  //cannot change reference to final
        StaticTestFinal.prop2 = prop2;
        System.out.println("prop1=" + prop1);
        System.out.println("prop2=" + prop2);
    }
}

//class StaticTestFinal2 extends StaticTestFinal {
//
//    @Override
//    public void priskirk(int prop1, int prop2) {
//        this.prop1 = prop1 * 2;  //cannot change reference to final
//        StaticTestFinal.prop2 = prop2 * 2;
//        System.out.println("prop1=" + prop1);
//        System.out.println("prop2=" + prop2);
//    }
//}