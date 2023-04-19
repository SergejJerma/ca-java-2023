package level1.lesson5;

public class OverLoading {

    public static void main(String[] args) {

        OverLoading ol = new OverLoading();

        OverLoading.method();
        method(1);
        method("xxx");
        method(1, "xxx");
        method("xxx", 1);
    }

    public static void method() {
        System.out.println("be param");
        method("na", 1);
    }
    public static void method(int num) {
        System.out.println("su num");
    }
    public static void method(String name) {
        System.out.println("su name");
    }
    public static void method(int num, String name) {
        System.out.println("su num ir name");
    }

    public static void method(String name, int num) {
        System.out.println("su name ir num");
    }

    public boolean method(String name, int num, String var) {
        System.out.println("su name ir num");
        return true;
    }
}
