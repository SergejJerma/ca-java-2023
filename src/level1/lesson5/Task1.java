package level1.lesson5;

public class Task1 {
    public static void main(String[] args) {
        m1();
        new Task1().m11();
    }

    public static void m1() {
        System.out.println("first");
        m2();
    }

    public void m11() {
        System.out.println("first>>>");
        m2();

        m111(); // teisingiausiais kvietimas

        new Task1().m111(); //perteklinis objekto kurimas

        Task1 t1 = new Task1(); // galimas variantas, reikia tureti tiksla kuriam bus panaudotas objektas, t.y. ne tik to metodo kvietimui
        t1.m111();
    }

    public void m111() {
        System.out.println("first>>>");
        m2();
    }

    public static void m2() {
        System.out.println("second");
        m3();
    }

    public static void m3() {
        System.out.println("third");
    }

    public static void print(String name, String surname, String lang, int monthNumber) {
        System.out.println("Aš, "+ name);
    }
}
