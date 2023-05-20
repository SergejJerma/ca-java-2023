package level1.lesson8;

public class SbTask1 {
    public static void main(String[] args) {
//        Turime „Liepa“ ir „Antradienis“
//        Paeiliui gauti: „LiepaAntradienis“, „sineidartnAapeiL“, „dartai“, „dar2018“, „darom2018“, „10“.

        StringBuilder sb1 = new StringBuilder("Liepa");
        StringBuilder sb2 = new StringBuilder("Antradienis");

        sb1.append(sb2);
        System.out.println(sb1); //LiepaAntradienis

        sb1.reverse();
        System.out.println(sb1); //sineidartnAapeiL

        sb1.delete(0, 5).delete(4, 6).delete(5, 7).deleteCharAt(6);
        System.out.println(sb1); //dartai

        sb1.delete(3, 6).append(2018);
        System.out.println(sb1); //dar2018

        sb1.insert(3, "om");
        System.out.println(sb1); //darom2018

        StringBuilder sb3 = new StringBuilder(sb1.substring(6,8));
        sb3.reverse();
        System.out.println(sb3); //10

    }
}
