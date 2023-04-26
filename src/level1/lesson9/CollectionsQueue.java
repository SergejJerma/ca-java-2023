package level1.lesson9;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        /* Sukuriamas dinaminio eiles objektas */
        Queue<Integer> eile = new PriorityQueue<>();

        /* Dedami objektai i eiles gala */
        eile.add(1);
        eile.add(3);
        eile.add(2);

        System.out.println("Eiles elementai: " + eile);

        /* Idedama dar elementu (i eiles gala) */
        eile.add(0);
        eile.add(3);
        eile.add(4);
        eile.add(5);

        System.out.println("Eiles elementai pridejus daugiau: " + eile);

        /* Isimami/istrinami elementai is eiles pagal reiksme */
        eile.remove(1);
        eile.remove(4);

        System.out.println("Eiles elementai po trynimo: " + eile);

        /* Gaunam eiles didi */
        int sarasoDydis = eile.size();
        System.out.println("eile.size() = " + sarasoDydis);

        /* Tikrinama, ar yra elementas pagal reiksme */
        boolean arYraAntras = eile.contains(2);
        System.out.println("arYraAntras = " + arYraAntras);

        //iteravimas per sarasa
        for (Integer element : eile) {
            System.out.println("Element: " + element);
        }

//        // Iteravimas per sarasa (kitaip)
//        eile.forEach(e -> {
//                    System.out.println("Element: " + e);
//                }
//        );

        System.out.println("Eiles elementai: " + eile);

        System.out.println("---------------------------------");
        /* Istraukti pirma elementa is eiles  */
        System.out.println("eile.poll() = " + eile.poll());
        System.out.println("Eiles elementai: " + eile);

        /* Paziureti i pirma elementa eileje  */
        System.out.println("eile.peek() = " + eile.peek());
        System.out.println("Eiles elementai: " + eile);

        /* Paziureti i pirma elementa eileje (mes NoSuchElementException jeigu eile tuscias) */
        System.out.println("eile.element() = " + eile.element());
        System.out.println("Eiles elementai: " + eile);
    }
}
