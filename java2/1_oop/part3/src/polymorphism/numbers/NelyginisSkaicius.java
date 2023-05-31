package polymorphism.numbers;

import java.util.List;

public class NelyginisSkaicius extends Skaicius {
    @Override
    public List<Integer> generuok() {
        return List.of(1, -5, -9, 7);
    }
}
