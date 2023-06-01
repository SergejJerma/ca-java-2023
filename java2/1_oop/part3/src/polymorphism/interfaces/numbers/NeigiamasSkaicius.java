package polymorphism.interfaces.numbers;

import java.util.List;

public class NeigiamasSkaicius implements Skaicius {
    @Override
    public List<Integer> generuok() {
        return List.of(-1, -9, -8, -1);
    }
}
