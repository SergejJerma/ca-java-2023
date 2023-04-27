package level1.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
//        iterationOverList();
//        dynamicElementRemoval();
        listElementSorting();
    }

    private static void listElementSorting() {
        System.out.println("listElementSorting");

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Vilnius");
        arrList.add("Kaunas");
        arrList.add("Kaunas2");
        arrList.add("Klaipeda");
        arrList.add("Siauliai");

        System.out.println(arrList);

        Collections.sort(arrList);
        System.out.println(arrList);

        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println(arrList);

        arrList.sort(Collections.reverseOrder());
        System.out.println(arrList);
    }

    private static void dynamicElementRemoval() {
        System.out.println("dynamicElementRemoval");
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Vilnius");
        arrlist.add("Kaunas");
        arrlist.add("Klaipeda");
        arrlist.add("Siauliai");

        //Throws ConcurrentModificationException
//        for (String str : arrlist) {
//            System.out.println(str);
//            arrlist.remove(str);
//        }

        //Throws IndexOutOfBoundsException
//        int size = arrlist.size();
//        for (int counter = 0; counter < size; counter++) {
//            System.out.println(arrlist.get(counter));
//            arrlist.remove(counter);
//        }


        //Throws IndexOutOfBoundsException
//        int count = 0;
//        int size = arrlist.size();
//        while (size > count) {
//            System.out.println(arrlist.get(count));  count++;
//            arrlist.remove(count);
//        }

        //The way to remove every element dynamically
        Iterator<String> iter = arrlist.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
            iter.remove();
        }
        System.out.println("Size after removing every element = " + arrlist.size());
    }

    private static void iterationOverList() {
        System.out.println("iterationOverList");
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
