import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 1. Write a Java program to create a generic method
 * that takes two arrays of the same type
 * and checks if they have the same elements in the same order.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("\ngeneric method with String array");
        String[] aString = {"a", "b", "c"};
        String[] bString = {"a", "b", "c"};
        System.out.println("areEqual: " + areEqual(aString, bString));  //true

        String[] cString = {"c", "b", "a"};
        System.out.println("areEqual: " + areEqual(aString, cString));  //false

        String[] dString = {"a", "b", "c", "d"};
        System.out.println("areEqual: " + areEqual(aString, dString));  //false



        System.out.println("\ngeneric method with Integer array");
        Integer[] aInteger = {1, 2, 3};
        Integer[] bInteger = {1, 2, 3};
        System.out.println("areEqual: " + areEqual(aInteger, bInteger));  //true

        Integer[] cInteger = {3, 2, 1};
        System.out.println("areEqual: " + areEqual(aInteger, cInteger));  //false
        HashMap<Integer, Integer> hm = new HashMap<>();


        System.out.println("\ngeneric method with Person array");
        Person[] aPersons = {new Person("name1"), new Person("name2"), new Person("name3")};
        Person[] bPersons = {new Person("name1"), new Person("name2"), new Person("name3")};
        System.out.println("areEqual: " + areEqual(aPersons, bPersons));  //true (because euqls method implemented). Otherwise would be false

        Person[] cPersons = {new Person("name4"), new Person("name2"), new Person("name3")};
        System.out.println("areEqual: " + areEqual(aPersons, cPersons));  //false

    }

    //Validate every element is equal
    public static <T> boolean areEqual(T[] a, T[] b) {
        System.out.println("a" + Arrays.toString(a));
        System.out.println("b" + Arrays.toString(b));

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    static class Person {
        String name;
        long timestamp;

        public Person(String name) {
            this.name = name;
            timestamp = System.currentTimeMillis();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return Objects.equals(name, person.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }



}
