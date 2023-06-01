package polymorphism.abstract_class.numbers;

import java.util.List;

public class NeigiamasSkaicius extends Skaicius {
    @Override
    public List<Integer> generuok() {
        return List.of(-1, -9, -8, -1);
    }
}
