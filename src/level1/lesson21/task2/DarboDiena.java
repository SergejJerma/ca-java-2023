package level1.lesson21.task2;

import java.util.Scanner;

public class DarboDiena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean darboDiena, atostogos;
        System.out.println("Ar dabar darbo diena? (true/false)");
        darboDiena = scanner.nextBoolean();
        if (!darboDiena) {
            System.out.println("Galima miegot");
            return;
        }
        System.out.println("Ar dabar atostogos? (true/false)");
        atostogos = scanner.nextBoolean();
        if (atostogos) {
            System.out.println("Galima miegot");
            return;
        }
        System.out.println("Negalima miegot");
    }
}
