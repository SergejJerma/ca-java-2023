package medziai;

public abstract class Medis {
    public void turi() {
        System.out.print(this.getClass().getSimpleName());
    }
}
