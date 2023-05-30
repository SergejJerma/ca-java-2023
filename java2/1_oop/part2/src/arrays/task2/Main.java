package arrays.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++)
            for (int j  = 0; j < arr[i].length; j++)
                arr[i][j] = rand.nextInt(10);

        System.out.println(Arrays.deepToString(arr));
    }
}
