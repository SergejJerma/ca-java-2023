package polymorphism.numbers;

import java.util.List;

public class MainNumbers {


    public static void main(String[] args) {

        Skaicius skaiciusLyginis = new LyginisSkaicius();
        callFunction(skaiciusLyginis);

        Skaicius skaiciusTeigiamas = new TeigiamasSkaicius();
        callFunction(skaiciusTeigiamas);

        Skaicius skaiciusNegiamas = new NeigiamasSkaicius();
        callFunction(skaiciusNegiamas);

        Skaicius skaiciusNelyginis = new NelyginisSkaicius();
        callFunction(skaiciusNelyginis);

        BetkoksSkaicius betkoks = new BetkoksSkaicius();
        Skaicius betkoksCast = betkoks;
        callFunction(betkoksCast);


    }

    public static void callFunction(Skaicius skaicius) {
        List<Integer> list = skaicius.generuok();
        System.out.println(list);

        System.out.println("suma: " + skaicius.suma(list));
    }
}
