package medziai;

import medziai.lapuociai.Azuolas;
import medziai.lapuociai.Berzas;
import medziai.spygliuociai.Egle;
import medziai.spygliuociai.Kadagys;
import medziai.spygliuociai.Pusis;
import medziai.spygliuociai.Spygliuotis;

import java.util.ArrayList;
import java.util.List;

public class MainSubtypes {
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
        //ivairusMiskas(spygliuociai);  <-- problem with subtypes
        //ivairusMiskas(berzynas);      <-- problem with subtypes

        //spygliuociuMiskas(medziai);
        spygliuociuMiskas(spygliuociai);
        //spygliuociuMiskas(berzynas);

//        berzuMiskas(medziai);
//        berzuMiskas(spygliuoziai);
        berzuMiskas(berzynas);
    }

    /*    Polymorphism allows us to use a subtype in place of a supertype */
    public static void ivairusMiskas(List<Medis> medziai) {
        medziai.forEach(medis -> medis.turi()); //lambda pavyzdys

        Medis pirmasMedis = medziai.get(0);
        pirmasMedis.turi();

        medziai.add(pirmasMedis);  //<-- with subtypes we can add to the list
    }

    public static void spygliuociuMiskas(List<Spygliuotis> spygliuociai) {
        spygliuociai.forEach(spygliuotis -> spygliuotis.turi()); //lambda pavyzdys

        Spygliuotis pirmasSpygliuotis = spygliuociai.get(0);
        pirmasSpygliuotis.turi();

        spygliuociai.add(pirmasSpygliuotis);
    }

    static void berzuMiskas(List<Berzas> berzai) {
        berzai.forEach(berzas -> berzas.turi()); //lambda pavyzdys

        Berzas pirmasBerzas = berzai.get(0);
        pirmasBerzas.turi();

        berzai.add(pirmasBerzas);
    }

}
