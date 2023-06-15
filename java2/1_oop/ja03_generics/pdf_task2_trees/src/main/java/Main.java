import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        azuolas.turi();

        Pusis pusis = new Pusis();
        pusis.turi();

        List<Medis> medziai = new ArrayList<>();
        medziai.add(new Azuolas());
        medziai.add(new Berzas());
        medziai.add(new Egle());

        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(new Pusis());
        spygliuociai.add(new Kadagys());
        spygliuociai.add(new Egle());

        List<Berzas> berzynas = new ArrayList<>();
        berzynas.add(new Berzas());

        ivairusMiskas(medziai);
        ivairusMiskas(spygliuociai);
        ivairusMiskas(berzynas);

        //spygliuociuMiskas(medziai);
        spygliuociuMiskas(spygliuociai);
        //spygliuociuMiskas(berzynas);

        //berzuMiskas(medziai);
        //berzuMiskas(spygliuoziai);
        berzuMiskas(berzynas);
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

    static <T extends Spygliuotis> void spygliuociuMiskas(List<T> spygliuociai) {
        spygliuociai.forEach(spygliuotis -> spygliuotis.turi()); //lambda pavyzdys

        T pirmasSpygliuotisT = spygliuociai.get(0);
        pirmasSpygliuotisT.turi();
        spygliuociai.add(pirmasSpygliuotisT);

        Spygliuotis pirmasSpygliuotis = spygliuociai.get(0);
        pirmasSpygliuotis.turi();
    }

    static <T extends Berzas> void berzuMiskas(List<T> berzai) {
        berzai.forEach(berzas -> berzas.turi()); //lambda pavyzdys

        T pirmasBerzasT = berzai.get(0);
        pirmasBerzasT.turi();
        berzai.add(pirmasBerzasT);

        Berzas pirmasBerzas = berzai.get(0);
        pirmasBerzas.turi();
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
