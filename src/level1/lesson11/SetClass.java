package level1.lesson11;

import java.util.HashSet;
import java.util.Iterator;

public class SetClass {
    public static void main(String[] args) {
        // Aibes sukurimas
        HashSet<String> aibe = new HashSet<>();

        // Elementu idejimas i aibe  aibe.add("Apple");
        aibe.add("Mango");
        aibe.add("Grapes");
        aibe.add("Orange");
        aibe.add("Fig");

        System.out.println(aibe);

        // Dedame pasikartojancius el., bet niekas nepasikeis  aibe.add("Apple");
        aibe.add("Mango");
        System.out.println("Aibe pridejus pasikartojanti elementa: " + aibe);

        System.out.println("Iteruojam per aibe:");
        Iterator<String> it = aibe.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        boolean contains = aibe.contains("Fig");
        System.out.println("Aibe contains Fig: " + contains);

        aibe.remove("Fig");
        System.out.println("Aibe isemus Fig: " + aibe);

        aibe.clear();
        System.out.println("Aibe atlikus clear(): " + aibe);
        System.out.println("Aibes dydis: " + aibe.size());

    }
}
