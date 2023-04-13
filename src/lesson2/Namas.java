package lesson2;

public class Namas {
    public static void main(String[] args) {
        String word1 = "Namas";

        String namai = word1.replace("s", "i");
        System.out.println(namai);

        String namaiUpperCase = namai.toUpperCase();
        System.out.println(namaiUpperCase);

        String ma = namaiUpperCase.substring(2, 4);
        System.out.println(ma);

        String maUpperCase = ma.toLowerCase();
        String MAma = ma + maUpperCase;
        System.out.println(MAma);

        String mana = MAma.replace("m", "n").replace("a", "x").replace("x", "a");
        System.out.println(mana);

        int count = 0;
        for (int i = 0; i < mana.length(); i++) {
            if (mana.charAt(i) == 'a' || mana.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}