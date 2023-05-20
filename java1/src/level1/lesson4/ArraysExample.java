package level1.lesson4;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] array = new String[100];

        //declare and initialize and array
        String [] age = {"12", "4", "5", "2", "5"};

        int getArrayIndex = Arrays.asList(age).indexOf("4");
        System.out.println("Index of 4: " + getArrayIndex);

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        // declare an array
        int[] age2 = new int[5];

        // initialize array
        age2[0] = 12;
        age2[1] = 4;
        age2[2] = 5;

        String transaction = "xxxxxx,yyyyy,zzzzz";
        String [] transactionDetails = transaction.split(",");
        System.out.println(transactionDetails[0]);
    }
}
