package level1.lesson5;

import java.util.Scanner;

public class MainExample {
    private int numInt;
    private Integer numberInteger;

    public static void main(String[] args) {
        Animal animal = new Animal();
        String temp = animal.getName();
        System.out.println(animal);

        String name = "cat";
        animal.setName(name);

        System.out.println(animal);

        Scanner sc = new Scanner(System.in);

        MainExample me = new MainExample();
        System.out.println("int default value: " + me.numInt);
        System.out.println("Integer default value: " + me.numberInteger);

        int a = 3;
        int b = 4;
        System.out.println(a == b);

        Auto auto = new Auto("Audi", 2015, 1.8f);
        System.out.println(auto.automobilioDuomenys(10000f));

    }
}
