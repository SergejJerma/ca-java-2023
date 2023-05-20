package level1.lesson4;

public class WhileLoops {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = 5 < 6;
        System.out.println(b1);
        System.out.println(b2);

        int i = 0;
        int j = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("<<<<<<<<<<<<<<<<");
        do {
            System.out.println(j);
            j++;
        } while (j < 1);
    }
}
