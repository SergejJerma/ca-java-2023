package polymorphism.interfaces.numbers;

import java.util.List;

public class TeigiamasSkaicius implements Skaicius {
    @Override
    public List<Integer> generuok() {
        return List.of(1, 2, 3, 4, 5, 6);
    }
}
