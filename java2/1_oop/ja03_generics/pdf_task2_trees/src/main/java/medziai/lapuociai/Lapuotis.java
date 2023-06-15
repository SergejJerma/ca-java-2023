package medziai.lapuociai;

import medziai.Medis;

public abstract class Lapuotis extends Medis {
    @Override
    public void turi() {
        super.turi();
        System.out.println(" turi Lapus");
    }
}
