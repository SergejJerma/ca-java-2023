package level1.lesson9;

import level1.tasks.tank.Tank;

public class Equals {


    public static void main(String[] args) {
        //comparePrimitives();

        //compareObjects();

        compareTanks();
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
