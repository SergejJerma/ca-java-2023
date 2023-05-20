package level1.lesson9;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args) {
        /* Sukuriamas dinaminio saraso objektas */
        HashMap<String, String> sarasas = new HashMap<>();

        /* Dedami objektai i sarasa */
        sarasas.put("Pirmas", "elementas1");
        sarasas.put("Antras", "elementas2");
        sarasas.put("Trecias", "elementas3");

        System.out.println("Saraso elementai: " + sarasas);

        /* Idedama dar elementu */
        sarasas.put("Ketvirtas", "elementas4");
        sarasas.put("Penktas", "elementas5");

        System.out.println("Saraso elementai pridejus daugiau: " + sarasas);

        /* Isimami/istrinami elementai is saraso pagal rakta */
        sarasas.remove("Trecias");
        sarasas.remove("Penktas");

        //Nori isimt elementa, kurio nera - no problem
        sarasas.remove("dfgsdfgafdlkj");

        System.out.println("Saraso elementai po trynimo: " + sarasas);


        /* Perrasom egzistuojanti elementa */
        sarasas.put("Penktas", "elementas555");
        System.out.println("Saraso elementai perrasius viena elementa : " + sarasas);

        /* Gaunam elementa pagal rakta */
        System.out.println("sarasas.get(\"Penktas\") = " + sarasas.get("Penktas"));

        /* Gaunam saraso didi */
        System.out.println("sarasas.size() = " + sarasas.size());

        System.out.println("sarasas.containsKey(\"Penktas\") = " + sarasas.containsKey("Penktas"));
        System.out.println("sarasas.containsValue(\"elementas555\") = " + sarasas.containsValue("elementas555"));

        // Iteravimas per sarasa
        for (Map.Entry<String,String> entry: sarasas.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }

    }
}
