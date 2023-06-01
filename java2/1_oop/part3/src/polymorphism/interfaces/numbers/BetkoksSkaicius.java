package polymorphism.interfaces.numbers;

import java.util.List;

public class BetkoksSkaicius implements Skaicius {

    public List<Integer> generuok() {
        return List.of(1,2,5,6);
    }
}
