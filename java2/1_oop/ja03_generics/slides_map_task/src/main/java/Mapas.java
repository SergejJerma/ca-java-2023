import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mapas<K, V> {

    private List<Pora<K, V>> poruSarasas = new ArrayList<>();

    public void ideti(K raktas, V reiksme) {
        Pora<K, V> pora = new Pora<>(raktas, reiksme);
        poruSarasas.add(pora);
    }

    public Pora<K, V> gauti(K raktas) {
        Optional<Pora<K, V>> poraOptional = poruSarasas.stream()
                .filter(pora -> pora.getRaktas().equals(raktas))
                .findAny();
        return poraOptional.orElse(null);
    }

    @Override
    public String toString() {
        return "Mapas{" +
                "poruSarasas=" + poruSarasas +
                '}';
    }
}
