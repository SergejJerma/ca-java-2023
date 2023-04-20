package level1.lesson5;

public class OverLoading {
    private static String CONSTANT_FIRST = "value";

    private String name;

    public static void main(String[] args) {
        System.out.println(CONSTANT_FIRST);
        OverLoading ol = new OverLoading();

        System.out.println(ol.name);

        ol.method();
        ol.method(1);
        ol.method("xxx");
        ol.method(1, "xxx");
        ol.method("xxx", 1);
    }

    public void method() {
        int temp = 0;
        temp++;
        method("ma", temp);
        printNumber(temp);
    }
    public void method(int num) {
        System.out.println("su num");
    }
    public void method(String name) {
        System.out.println("su name");
    }
    public void method(int num, String name) {

        System.out.println("su num ir name");
    }

    public void method(String name, int num) {
        System.out.println("su name ir num");
        System.out.println(">>>> temp is method be parm " + num);
    }

    public boolean method(String name, int num, String var) {
        System.out.println("su name ir num");
        return true;
    }

    public static void printNumber(int num) {
        System.out.println(">>>>is kito metodo "+num);
    }
}
