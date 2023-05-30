package arrays.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {
        initializeThenFillThenPrint();
        fillWhenInitializing();
        useArraysFill();
    }

    private static void useArraysFill() {
        int[][] arr2d = new int[4][4];
        for (int i = 0; i < 4; i++) {
            int[] arr1d = new int[4];
            Arrays.fill(arr1d, rand.nextInt(10));
            arr2d[i] = arr1d;
        }
        System.out.println(Arrays.deepToString(arr2d));
    }

    private static void fillWhenInitializing() {
        int[][] arr = {
                {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)},
                {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)},
                {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)},
                {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)}
        };

        System.out.println(Arrays.deepToString(arr));
    }

    private static void initializeThenFillThenPrint() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = rand.nextInt(10);

        System.out.println(Arrays.deepToString(arr));
    }
}
