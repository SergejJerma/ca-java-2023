import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UserInterface {

    private final Supplier<String> supplier;
    private final Consumer<String> consumer;

    public UserInterface(Supplier<String> supplier, Consumer<String> consumer) {
        this.supplier = supplier;
        this.consumer = consumer;
    }

    public List<String> getWordList() {
        consumer.accept("Pateikite [zodziu sarasa]");
        String visiZodziai = supplier.get();
        List<String> zodziai = List.of(visiZodziai.split(" "));
        return zodziai;
    }

    public int[] getListBounds() {
        consumer.accept("Kurios zodzius isrinkti? [int:nuo int:iki]: ");
        String ruozas = supplier.get(); //todo: what if user enter not numerics or fewer than 2 digits?
        String[] ruozasArr = ruozas.split(" ");
        int pradziosIndexas = Integer.parseInt(ruozasArr[0]);
        int pabaigosIndexas = Integer.parseInt(ruozasArr[1]);
        return new int[]{pradziosIndexas, pabaigosIndexas};
    }

    public void showResult(List<String> zodziai, int[] ribos, List<String> resultatas) {
        String result = String.format("Pateiktame zodziu sarase:%n%s%nzodziai nuo %d iki %d yra:%n%s",
                zodziai,
                ribos[0],
                ribos[1],
                resultatas
        );
        consumer.accept(result);
    }
}
