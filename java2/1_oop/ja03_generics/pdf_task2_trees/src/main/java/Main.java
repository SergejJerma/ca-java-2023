import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        azuolas.turi();

        Pusis pusis = new Pusis();
        pusis.turi();

        List<Medis> medziai = List.of(new Azuolas(), new Berzas(), new Egle());
        List<Spygliuotis> spygliuoziai = List.of(new Pusis(), new Kadagys(), new Egle());
        List<Berzas> berzynas = List.of(new Berzas());

        ivairusMiskas(medziai);
        ivairusMiskas(spygliuoziai);
        ivairusMiskas(berzynas);
    }

    // Generics (generic method)
    //    <tipo 'T' aprasymas>               <panaudojame tipa T>
    //            v                                  v
    static <T extends Medis> void ivairusMiskas(List<T> medziai) {
        medziai.forEach(medis -> medis.turi()); //lambda pavyzdys

//        for (T medis: medziai)
//            medis.turi();

        //java compiler'is zino, kad T yra bet kok tipas (klase),
        // extend'inantis tipą 'Medis'          //<T extends Medis>
        T pirmasMedisT = medziai.get(0);
        pirmasMedisT.turi();
        medziai.add(pirmasMedisT);

        Medis pirmasMedis = medziai.get(0);
        pirmasMedis.turi();
        //medziai.add(pirmasMedis);   // <-- generic'u silpnoji vieta - negalime prideti i sarasa: "Required type: T; Provided Medis"
    }


}

abstract class Medis {
    void turi() {
        System.out.print(this.getClass().getSimpleName());
    }
}

abstract class Lapuotis extends Medis {
    @Override
    void turi() {
        super.turi();
        System.out.println(" turi Lapus");
    }
}

abstract class Spygliuotis extends Medis {
    @Override
    void turi() {
        super.turi();
        System.out.println(" turi Spyglius");
    }
}

class Azuolas extends Lapuotis {

}

class Berzas extends Lapuotis {

}

class Egle extends Spygliuotis {

}

class Pusis extends Spygliuotis {

}

class Kadagys extends Spygliuotis {

}
