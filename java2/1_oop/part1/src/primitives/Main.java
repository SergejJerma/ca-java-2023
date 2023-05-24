package primitives;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("i = " + i);      //0
        System.out.println("i++ = " + i++);    //0
        System.out.println("i = " + i);      //1
        System.out.println("i = " + i);      //1
        System.out.println("++i = " + ++i);      //2
        System.out.println("i = " + i);      //2

        int j = 0;
        j += 1; // j = j + 1
        System.out.println("j = " + j); //1

        j = 10;
        System.out.println("10 % 3 (liekana) = " + 10 % 3); //1
        System.out.println("10 / 3 = " + j / 3);    //3
        System.out.println("11 / 3 = " + 11 / 3);   //3

        float result = 10.1f + 5.2f;
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        System.out.println("Number: " + decimalFormat.format(result));


    }
}
