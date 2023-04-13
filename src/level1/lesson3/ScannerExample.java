package level1.lesson3;


import java.util.Scanner;

public class ScannerExample {
    public static final String MY_CONSTANT = "const";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        int userName = scanner.nextInt();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}