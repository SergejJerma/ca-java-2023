package level1.lesson5;

public class StringEqual {
    public static void main(String[] args) {
        String a = "tekstas";
        String b = "tekstas";
        String c = new String("tekstas");
        String d = "kitoks tekstas";

        System.out.println(a == b); // true. Lyginamos nuorodos.
// Nuorodos rodo į tą patį objektą.

        System.out.println(a == c); // false. Lyginamos nuorodos.
        System.out.println(">>>>>>>" + a.equals(c)); // lyginamos reikšmės
// Nuorodos rodo į skirtingus objektus,
// nes viena iš eilučių yra sukurta
// naudojant operatorių new, kas yra
// naujo objekto sukūrimas.

        System.out.println(a == d); // false. Lyginamos nuorodos.
// Nuorodos rodo į skirtingus objektus.

        c = a;

        System.out.println(a == c); // true. Lyginamos nuorodos.
        System.out.println(">>>>>>>" + a.equals(c)); // lyginamos reikšmės
// Nuorodos rodo į tą patį objektą.


    }
}
