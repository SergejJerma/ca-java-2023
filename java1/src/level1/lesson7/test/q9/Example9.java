package level1.lesson7.test.q9;

public class Example9 {
    public static void main(String[] args) {
        boolean melas = false;
        System.out.println("A");
        int i = 0;

        do {
            System.out.println("B");
            i++;
            if (melas) {
                melas = true;
                break;
            }
        } while (5 > i);
        System.out.println("C");

        while (!melas) {
            System.out.println("CCCC");
            melas = true;
        }
    }
}
