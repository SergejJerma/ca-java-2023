package polymorphism.abstract_class.numbers;

import java.util.List;

public class LyginisSkaicius extends Skaicius{
    @Override
    public List<Integer> generuok() {
        return List.of(2, -8, 6, 4);
    }

}
