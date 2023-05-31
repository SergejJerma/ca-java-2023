package polymorphism.numbers;

import java.util.ArrayList;
import java.util.List;

abstract class Skaicius {
    protected List<Integer> numbers = new ArrayList<>();

    public abstract List<Integer> generuok();

    public Integer suma(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + numbers +
                '}';
    }
}
