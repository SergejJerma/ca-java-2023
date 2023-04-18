package level1.tasks;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] names = {"Jonas", "Petras", "Marytė"};
        System.out.println(names[0]);

        System.out.println(names[0].toUpperCase() + "-" + names[0].length()  + "-" + 0);
        System.out.println(names[1].toUpperCase() + "-" + names[1].length()  + "-" + 1);
        System.out.println(names[2].toUpperCase() + "-" + names[2].length()  + "-" + 2);


        int[][] numbers = {{1,6,8,9,10},{2,6,6,5}};
        System.out.println(Arrays.deepToString(numbers));
    }
}
