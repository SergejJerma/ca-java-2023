package level1.lesson9;

import level1.tasks.tank.Tank;

public class Equals {


    public static void main(String[] args) {
        //comparePrimitives();

        //compareObjects();

        //compareTanks();

        compareStrings();
    }

    private static void compareStrings() {
        //Initialize a String object without using constructor:
        // Java automagically puts a new string into some string bucket
        // But if such string already exists - java does not create a new string object - instead it uses the one
        // that already exists in the bucket
        // This reduces memory (RAM) usage
        String a = "aaa";
        String a1 = "aaa";

        System.out.println(a == a1);    //true

        //Initialize a String object using constructor (IN REAL LIFE - NOT RECOMMENDED)
        // java will just create a new String. It will do nothing regarding the string bucket
        String a2 = new String("aaa");

        System.out.println(a == a2);    //false


        System.out.println(a.equals(a2));   //true
    }

    private static void compareTanks() {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        System.out.println("tank equals: " + tank1.equals(tank2));

        System.out.println("tank == " + (tank1 == tank2)); // false
    }

    private static void compareObjects() {
        String a = new String("Namas");
        String b = new String("Namas");
        String c = new String("Miestas");

//        System.out.println(a == b); // false
//        System.out.println(a == c); // false
//        System.out.println(b == c); // false

        System.out.println(a.equals(b));  //true
        System.out.println(a.equals(c));  //false
        System.out.println(b.equals(c));  //false

        a=b;
        System.out.println(a == b); // false
    }

    private static void comparePrimitives() {
        double a = 1000;
        double b = 1000;
        double c = 999;

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(b == c); // false
    }
}
