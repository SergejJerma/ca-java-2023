package polymorphism.abstract_class.numbers;

import java.util.ArrayList;
import java.util.List;

abstract class Skaicius {
    List<Integer> numbers = new ArrayList<>();

    public abstract List<Integer> generuok();

    public Integer suma(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + numbers +
                '}';
    }
}
