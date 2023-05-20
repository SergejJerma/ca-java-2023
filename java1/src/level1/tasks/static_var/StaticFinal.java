package level1.tasks.static_var;

public class StaticFinal {
    public static String myString;
    private static final String MY_CONST = "myConst";

    public static void change(String param) {
        System.out.println(myString + "   pries");
        myString = param;
        System.out.println(myString + "   po");

        System.out.println(MY_CONST + "    CONSTANTA");
    }
}
