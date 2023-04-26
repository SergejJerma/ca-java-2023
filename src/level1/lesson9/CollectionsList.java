package level1.lesson9;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        /* Sukuriamas dinaminio saraso objektas */
        List<String> sarasas = new ArrayList<>();
//        sarasas.ensureCapacity(5);

        /* Dedami objektai i sarasa */
        sarasas.add("Pirmas");
        sarasas.add("Antras");
        sarasas.add("Trecias");
        sarasas.add("Ketvirtas");
        sarasas.add("Penktas");

        System.out.println("Saraso elementai: " + sarasas);

        /* Idedama dar elementu i saraso pradzia */
        sarasas.add(0, "Sestas");
        sarasas.add(1, "Septintas");

        System.out.println("Saraso elementai pridejus daugiau: " + sarasas);

        /* Isimami/istrinami elementai is saraso pagal reiksme */
        sarasas.remove("Trecias");
        sarasas.remove("Penktas");

        System.out.println("Saraso elementai po trynimo: " + sarasas);

        /* Isimamas/istrinamas 1-as elementas */
        sarasas.remove(1);

        System.out.println("Saraso elementai istrynus [1]: " + sarasas);

        // pakeiciamas 2-as elementas
        sarasas.set(2, "*****");
        System.out.println("Saraso elementai pakeitus [2]: " + sarasas);

        // gaunama elemento pozicija sarase
        int pos = sarasas.indexOf("*****");
        System.out.println("pos = " + pos);

        // gaunamas elementas pagal indeksa
        String elementas = sarasas.get(2);
        System.out.println(elementas);

        // gaunamas saraso dydis
        int sarasoDydis = sarasas.size();
        System.out.println("sarasoDydis = " + sarasoDydis);

        boolean arYraAntras = sarasas.contains("Antras");
        System.out.println("arYraAntras = " + arYraAntras);


        System.out.println("-------------------------------------------");

        String zodisAntras = sarasas.get(1);
        System.out.println(zodisAntras);
        int zodzioAntrasIlgis = zodisAntras.length();
        System.out.println(zodzioAntrasIlgis);
        System.out.println(sarasas.get(1).length());


        System.out.println("-------------------------------------------");
        System.out.println("Iteravimas per saraso elementus");
        for (String element : sarasas) {
            int i = sarasas.indexOf(element);
            System.out.println("Element: " + element + ", Indeksas: " + i);
        }

        for (int i = 0; i < sarasas.size(); i++) {
            System.out.println("Element: " + sarasas.get(i) + ", Indeksas: " + i);
        }

        sarasas.forEach(e -> {
                    int i = sarasas.indexOf(e);
                    System.out.println("Element: " + e + ", Indeksas: " + i);
                }
        );

        System.out.println("Saraso elementai: " + sarasas);
    }
}
