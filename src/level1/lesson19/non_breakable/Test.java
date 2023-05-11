package level1.lesson19.non_breakable;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean runProgram = true;

        while (runProgram) {
            System.out.print("Iveskite skaiciu, arba X - baigt programa: ");
            String skaiciusStr = sc.next(); // nuskaitomas skaičius kaip tekstas

            try {
                if (skaiciusStr.equalsIgnoreCase("X")) {
                    System.out.println("Programa baigiama vartotojo pasirinkimu");
                    //return;
                    runProgram = false;
                    continue;
                }

                int skaiciusInt = Integer.parseInt(skaiciusStr);        // tekstas paverčiamas i skaičiu (int)
                System.out.println(String.format("Ivestas skaicius yra %d", skaiciusInt));
                runProgram = false;
            } catch (NumberFormatException nfe) {
                // jei vartotojas ivede ne skaičiu, tada bus pagauta ši klaida
                System.out.println("Klaida! Ivestas ne skaicius!");
            }
        }
        sc.close();
    }

}
