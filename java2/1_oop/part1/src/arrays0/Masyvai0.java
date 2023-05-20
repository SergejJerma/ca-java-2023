package arrays0;

import java.util.Arrays;

public class Masyvai0 {
    public static void main(String[] args) {
        int myIntArray[];
        myIntArray = new int[3];
        int lenght = myIntArray.length;
        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        System.out.println("myIntArray dydis (ilgis) yra " + lenght);
        System.out.println("paskutinis narys " + myIntArray[lenght - 1]);

        //kitas budas sukurti masyva
        int anotherArray[] = {0, 1, 2};
        System.out.println("anotherArray dydis (ilgis) yra " + anotherArray.length);

        /* kaip prideti i masyva daugiau nei pradinis jo ilgis?
            - neimanoma - teks sukurti nauja masyva: Arrays.copyOf sukurs nauja masyva
         */
        int[] anotherArray_longer = Arrays.copyOf(anotherArray, anotherArray.length + 1);
        anotherArray_longer[3] = 40;
        System.out.println("anotherArray_longer dydis (ilgis) yra " + anotherArray_longer.length);

        // Galime perrasyti nuodora i anotherArray.
        // Senasis masyvas (senoji anotherArray verte) taps nebenaudojamu objektu ir ji pasalins Garbage Collector'ius
        anotherArray = anotherArray_longer;
    }
}
