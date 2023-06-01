package polymorphism.abstract_class.numbers;

import java.util.List;

abstract class Skaicius {

    public abstract List<Integer> generuok();

    public Integer suma(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

}
