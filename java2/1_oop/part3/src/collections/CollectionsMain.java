package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {

        List<String> kolekcija = new ArrayList<>();
        kolekcija.add("Vienas");

        kolekcija.add("Du");

        Iterator<String> iteratorius = kolekcija.iterator();



        while (iteratorius.hasNext()) {
            System.out.println(iteratorius.next());


        }


//        Map<Integer, Example1> map = new HashMap<>();
//
//        Example1 obj1 = new Example1("xxx", LocalDateTime.now());
//        Example1 obj2 = new Example1("yyy", LocalDateTime.now());
//        Example1 obj3 = new Example1("zzz", LocalDateTime.now());
//        Example1 obj4 = new Example1("zzzz", LocalDateTime.now());
//
//
//        map.put(1, obj1);
//        map.put(2, obj2);
//        map.put(3, obj3);
//        System.out.println(map.values());
//        map.put(3, obj4);
//        System.out.println(map.values());
//
//        System.out.println(map.size());
//
//        map.remove(3, obj4);
//        System.out.println(map.values());

//        System.out.println(map.get(2));

      //  System.out.println(map);






//        Set<String> kolekcija = new HashSet<>();
//        kolekcija.add("Pirmas");
//        kolekcija.add("Antras");
//        System.out.println(kolekcija.add("Pirmas"));
//        System.out.println(kolekcija);
//        System.out.println(kolekcija.size());
//
//        Set<Example> examples = new HashSet<>();
//
//        Example obj1 = new Example("xxx", "2023-04-01");
//        Example obj2 = new Example("yyy", "2022-04-01");
//        Example obj3 = new Example("yyy", "2022-04-01");
//
//        Example obj5 = new Example("XXX", "2023-04-01");
//        Example obj4 = new Example("yyy", "2022-04-01");
//
//
//        examples.add(obj1);
//        examples.add(obj2);
//        examples.add(obj3);
//        examples.add(obj4);
//        examples.add(obj5);
//
//        System.out.println(examples);


        List<Example> examplesArray = new ArrayList<>();
//
//        Example obj1 = new Example("xxx", "2023-04-01");
//        Example obj2 = new Example("yyy", "2022-04-01");
//        Example obj3 = new Example("yyy", "2022-04-01");
//
//        Example obj5 = new Example("XXX", "2023-04-01");
//
//
//        Example obj4 = new Example("yyy", "2022-04-01");
//
//
//        examplesArray.add(obj1);
//        examplesArray.add(obj2);
//        examplesArray.add(obj3);
//        examplesArray.add(obj4);
//        examplesArray.add(obj5);

        examplesArray.forEach(example -> {
            System.out.println(example.getName());
        });

//        examplesArray.forEach(System.out::println);
//
//        Set<Example> exampleSet = new HashSet<>();
//        exampleSet.addAll(examplesArray);
//        System.out.println(exampleSet);
//        exampleSet.remove(obj4);
//        System.out.println(exampleSet);

//
//        System.out.println(examples);
//
//        examples.set(2, obj5);
//
//        System.out.println(examples);


//       examples = examples.stream().filter(example -> !example.equals(o4)).collect(Collectors.toList());
////
//        examples.remove(o4);
////
//        System.out.println(examples);
//
//        examples.remove(o4);
//
//        System.out.println(examples);


//        List<String> kolekcija = new ArrayList<>();
//
//        kolekcija.add("1");
//        kolekcija.add("2");
//        kolekcija.add("1");
//
//        System.out.println(kolekcija);
//
//        boolean removeResult = kolekcija.remove("1");
//        System.out.println(removeResult);
//
//        System.out.println(kolekcija);
//
//        boolean removeResult1 = kolekcija.remove("1");
//        System.out.println(removeResult);
//
//        System.out.println(kolekcija);


//        remove()
//        set(int index,obj)
//        indexOf()


    }
}
