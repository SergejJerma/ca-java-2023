package level1.lesson18.failai;

public class Automobilis {

    private int ratuSkaicius;
    private int maxGreitis;

    public Automobilis(int ratuSkaicius, int maxGreitis) {
        this.ratuSkaicius = ratuSkaicius;
        this.maxGreitis = maxGreitis;
    }

    public static Automobilis fromString(String string) {
        String[] split = string.split(",");
        return new Automobilis(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
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

    public String toJsonString() {
        return String.format("{\"ratuSkaicius\":%d,\"maxGreitis\":%d}", ratuSkaicius, maxGreitis);
    }
}
