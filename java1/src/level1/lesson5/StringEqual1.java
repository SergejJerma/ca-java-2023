package level1.lesson5;

public class StringEqual1 {
    public static void main(String[] args) {
        String a = "tekstas";
        String b = "tekstas";
        String c = new String("tekstas");
        String d = "kitoks tekstas";

        System.out.println(a.equals(b)); // true
        // a ir b objektų reikšmės sutampa

        System.out.println(a.equals(c)); // true
        // a ir c objektų reikšmės sutampa

        System.out.println(a.equals(d)); // false
        // a ir d objektų reikšmės skirtingos

        d = a;

        System.out.println(a.equals(d)); // true.
        // a ir d objektų reikšmės sutampa
    }
}
