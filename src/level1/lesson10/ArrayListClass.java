package level1.lesson10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        iterationOverList();

    }

    private static void iterationOverList() {
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Vilnius");
        arrlist.add("Kaunas");
        arrlist.add("Klaipeda");
        arrlist.add("Siauliai");

        /* Iprastas FOR ciklas */
        System.out.println("\nIprastas FOR ciklas");
        for (int counter = 0; counter < arrlist.size(); counter++) {
            System.out.println(arrlist.get(counter));
        }

        /* FOR ciklas masyvams ir sarasams */
        System.out.println("\nFOR ciklas masyvams ir sarasams");
        for (String str : arrlist) {
            System.out.println(str);
        }

        /* WHILE ciklas */
        System.out.println("\nWHILE ciklas");
        int count = 0;
        while (arrlist.size() > count) {
            System.out.println(arrlist.get(count));  count++;
        }

        /* WHILE + ITERATOR */
        System.out.println("\nWHILE + ITERATOR");
        Iterator<String> iter = arrlist.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
