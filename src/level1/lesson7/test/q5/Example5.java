package level1.lesson7.test.q5;

public class Example5 {
    public static void main(String[] args) {
        int i = 10;
//        int n = ++i % 5; // 11, 1
        int n = i++ % 5; // 11, 0
        System.out.println("i = " + i
                + ", n = " + n);
    }

}
