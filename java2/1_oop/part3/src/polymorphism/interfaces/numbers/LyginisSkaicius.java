package polymorphism.interfaces.numbers;

import java.util.List;

public class LyginisSkaicius implements Skaicius {
    @Override
    public List<Integer> generuok() {
        return List.of(2, -8, 6, 4);
    }

}
