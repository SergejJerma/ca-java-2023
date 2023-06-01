package polymorphism.interfaces.numbers;

import java.util.List;

interface Skaicius {
    List<Integer> generuok();

   default Integer suma(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

}
