package medziai.spygliuociai;

import medziai.Medis;

public abstract class Spygliuotis extends Medis {
    @Override
    public void turi() {
        super.turi();
        System.out.println(" turi Spyglius");
    }
}
