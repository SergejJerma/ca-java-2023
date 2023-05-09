package level1.lesson17;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
//        double pi = 3.145288541544;
//        double pi2 = Double.valueOf(String.format("%.2f",  pi));
//
//        System.out.println(pi);
//        System.out.println(pi2);

//        StringBuilder  builder  =	new  StringBuilder("Pamoka");
//        builder.reverse();
//        builder.replace(0,2,"2018");
//
//
//        System.out.println(builder);
//        String stringas  =	new  String("Pamoka");
//        stringas = stringas.toUpperCase();
//        stringas = stringas.replace('A', 'b');
//
//        System.out.println(stringas);

//        String pamoka = "pamoka";
//        String pamoka2 = "pamoka";
////        String pamoka2 = new String("pamoka");
//        boolean arLygu = pamoka == pamoka2;
////        boolean arLygu = "pamoka".equals("pamoka");
//        System.out.println(arLygu);

//        Integer i1 = new Integer(100);
//        Integer i2 = new Integer(100);
//        boolean arLygu = i1.equals(i2);
//        System.out.println(arLygu);

        List<Integer> list = new ArrayList<>(); //1,2,5,3,4
        List<Integer> linkedList = new LinkedList<>(); // 1<->2<->5<->3<->4

        Set<Integer> setas = new HashSet<>();

        setas.add(1);
        setas.add(2);
        System.out.println(setas);
        setas.add(1);
        setas.add(2);
        setas.add(3);
        setas.add(4);
        System.out.println(setas);


        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "pirmas");
        hashMap.put(1, "antras");
        System.out.println(hashMap);

        //ArrayList, LinkedList, HashSet ir HashMap?

    }
}
