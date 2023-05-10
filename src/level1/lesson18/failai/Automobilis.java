package level1.lesson18.failai;

public class Automobilis {

    int ratuSkaicius;
    int maxGreitis;

    public Automobilis(int ratuSkaicius, int maxGreitis) {
        this.ratuSkaicius = ratuSkaicius;
        this.maxGreitis = maxGreitis;
    }

    @Override
    public String toString() {
        return String.format("%d,%d%n", ratuSkaicius, maxGreitis);
    }

    public int getRatuSkaicius() {
        return ratuSkaicius;
    }

    public int getMaxGreitis() {
        return maxGreitis;
    }
}
