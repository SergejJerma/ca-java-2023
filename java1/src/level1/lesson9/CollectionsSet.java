package level1.lesson9;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {
    public static void main(String[] args) {
        /* Sukuriamas dinaminio saraso objektas */
        Set<String> sarasas = new HashSet<>();

        /* Dedami objektai i sarasa */
        sarasas.add("Pirmas");
        sarasas.add("Antras");
        sarasas.add("Trecias");
        sarasas.add("Ketvirtas");
        sarasas.add("Penktas");

        System.out.println("Saraso elementai: " + sarasas);

        /* Idedama dar elementu */
        sarasas.add("Sestas");
        sarasas.add("Septintas");

        System.out.println("Saraso elementai pridejus daugiau: " + sarasas);

        sarasas.add("Septintas");
        sarasas.add("Septintas");
        sarasas.add("Septintas");
        System.out.println("Saraso elementai pridejus dublikatu: " + sarasas);


        /* Isimami/istrinami elementai is saraso pagal reiksme */
        sarasas.remove("Trecias");
        sarasas.remove("Penktas");

        System.out.println("Saraso elementai po trynimo: " + sarasas);

        /* Gaunamas saraso dydis */
        int sarasoDydis = sarasas.size();
        System.out.println("sarasoDydis = " + sarasoDydis);

        /* Tikrinama, ar yra elementas pagal reiksme */
        boolean arYraAntras = sarasas.contains("Antras");
        System.out.println("arYraAntras = " + arYraAntras);

        // Iteravimas per sarasa
        for (String element : sarasas) {
            System.out.println("Element: " + element);
        }

        // Iteravimas per sarasa (kitaip)
        sarasas.forEach(e -> {
                    System.out.println("Element: " + e);
                }
        );

        System.out.println("Saraso elementai: " + sarasas);
    }
}
