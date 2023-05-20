package level1.lesson10;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        // sukuriamas tuscias susietas sarasas
        LinkedList<String> sujungtasSarasas = new LinkedList<>();

        // i sarasa dedami elementai
        sujungtasSarasas.add("vasaris");
        sujungtasSarasas.add("kovas");
        sujungtasSarasas.add("balandis");
        sujungtasSarasas.add("geguze");

        System.out.println("sujungtasSarasas: " + sujungtasSarasas);

        // idedame elementus i sarso i pradzia ir i pabaiga
        sujungtasSarasas.addFirst("SAUSIS");
        sujungtasSarasas.addLast("BIRZELIS");

        System.out.println(sujungtasSarasas);

        // istriname pirma ir paskutini elementus
        if (!sujungtasSarasas.isEmpty())
            sujungtasSarasas.removeFirst();

        if (!sujungtasSarasas.isEmpty())
            sujungtasSarasas.removeLast();

        System.out.println(sujungtasSarasas);

        // idedame ir istriname pagal indeksa
        sujungtasSarasas.add(0, "Dar vienas menuo");
        sujungtasSarasas.remove(2);

        // dar yra removeFirst() ir removeLast() metodai,
        // kurie istrina pirma ir paskutini elementus
        sujungtasSarasas.removeFirst();
        sujungtasSarasas.removeLast();

        System.out.println("sujungtasSarasas po removeFirst ir removeLast: " + sujungtasSarasas);

        // grazina saraso pirmaji elementa ir ji istrina is saraso
        String menuo = sujungtasSarasas.poll();
        System.out.println(menuo);
        System.out.println(sujungtasSarasas);

        // grazina saraso pirmaji elementa ir ji istrina is saraso
        menuo = sujungtasSarasas.pollFirst();
        System.out.println(menuo);
        System.out.println(sujungtasSarasas);

        // grazina saraso pirmaji elementa ir ji istrina is saraso
        menuo = sujungtasSarasas.pollLast();
        System.out.println(menuo);
        System.out.println(sujungtasSarasas);

        System.out.println("------------------------------------------------");

        sujungtasSarasas.add("vasaris");
        sujungtasSarasas.add("kovas");
        sujungtasSarasas.add("balandis");
        sujungtasSarasas.add("geguze");

        System.out.println(sujungtasSarasas);

        sujungtasSarasas.push("sausis");

        System.out.println(sujungtasSarasas);

        String ispoppintasElementas = sujungtasSarasas.pop();

        System.out.println(sujungtasSarasas);
        System.out.println("ispoppintasElementas " + ispoppintasElementas);

    }
}
