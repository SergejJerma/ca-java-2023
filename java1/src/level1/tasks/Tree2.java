package level1.tasks;

public class Tree2 {
    public static void main(String[] args) {
        String star = "*";

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
