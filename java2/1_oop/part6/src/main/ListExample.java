import java.util.List;
import java.util.function.Predicate;

public class ListExample {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(); ///1,2,3,4,5 <-3
//        List<String> linked = new LinkedList<>(); // 1->2->3<-4->5  3
//
//         Set<String> set = new HashSet<>();
//
////        list.stream().filter().map().collect();
//        // map flatmap
////
//        Map<Integer, List<String>> map = new HashMap<>();

//        List<List<Integer> > number = new ArrayList<>();
//
//        // adding the elements to number arraylist
//        number.add(Arrays.asList(1, 2));
//        number.add(Arrays.asList(3, 4));
//        number.add(Arrays.asList(5, 6));
//        number.add(Arrays.asList(7, 8));
//
//        System.out.println("List of list-" + number);
//
//        // using flatmap() to flatten this list
//        List<Integer> flatList
//                = number.stream()
//                .flatMap(list -> list.stream())
//                .collect(Collectors.toList());
//
//        // printing the list
//        System.out.println("List generate by flatMap-"
//                + flatList);

//        List<String> names = List.of("Silvija", "Jonas", "Petras");
//
//        List<String> namesListas = List.of("Silvija", "Jonas", "Petras");
//
//        Predicate<String> nameStartsWithS = str -> str.startsWith("S");
//
//        names.stream().filter(nameStartsWithS).forEach(System.out::println);
//
//        namesListas.stream().filter(nameStartsWithS).forEach(System.out::println);

        List<Integer> numbers = List.of(2, 6, 9, 8, 11, 2, 5);

        Predicate<Integer> predicate = num -> num <= 5 || num > 10;

        numbers.stream().filter(num -> num <= 5 || num > 10).forEach(s -> System.out.println(s));




    }
}
