package level1.tasks.lesson12.uzd2;


import java.util.ArrayList;
import java.util.List;

public class AsmuoMain {
    public static void main(String[] args) {
        Asmuo asmuo = new Asmuo("vardenis", "pavardenis");
        System.out.println(asmuo);


        List<Asmuo> asmenuSarasas = new ArrayList<>();
        asmenuSarasas.add(asmuo);
        asmenuSarasas.add(new Asmuo("vardenis2", "pavardenis2"));

        System.out.println(asmenuSarasas);


    }
}
