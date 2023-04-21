package level1.lesson3;


import java.util.Scanner;

public class ScannerExample {

    private String classField;
    public static String myStatic = "staticValue";
    public static final String MY_CONSTANT = "const";
    public static void main(String[] args) {

        ScannerExample sc = new ScannerExample();
        ScannerExample sc1 = new ScannerExample();

//        System.out.println(ScannerExample.myStatic);
        System.out.println(sc.classField);
        System.out.println(sc.myStatic);
        System.out.println(sc1.classField);
        System.out.println(sc1.myStatic);

        sc.myStatic = "nextStaticValue";
        sc.classField ="sc object";
        sc1.classField ="sc1 object";
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println(sc.classField);
        System.out.println(sc.myStatic);
        System.out.println(sc1.classField);
        System.out.println(ScannerExample.myStatic);

//        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        int userName = scanner.nextInt();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
    }
}