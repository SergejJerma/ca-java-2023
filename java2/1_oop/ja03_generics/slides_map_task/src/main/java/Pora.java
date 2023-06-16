public class Pora<K, V> {
    private final K raktas;
    private final V reiksme;

    public Pora(K raktas, V reiksme) {
        this.raktas = raktas;
        this.reiksme = reiksme;
    }

    public K getRaktas() {
        return raktas;
    }

    @Override
    public String toString() {
        return "Pora{" +
                "raktas=" + raktas +
                ", reiksme=" + reiksme +
                '}';
    }
}
