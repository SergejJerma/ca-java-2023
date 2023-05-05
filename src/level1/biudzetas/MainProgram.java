package level1.biudzetas;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command;

        boolean isRunning = true;
        Biudzetas biudzetas = new Biudzetas();

        while (isRunning) {
            System.out.println("Iveskite ka norite daryti: \n"
                    + "[1] - ivesti irasa \n"
					+ "[2] - gauti visus pajamu irasus \n"
					+ "[3] - gauti visus islaidu irasus \n"
                    + "[4] - redaguoti irasa \n"
                    + "[5] - atnaujinti irasa \n"
                    + "[6] - gauti balansa \n"
                    + "[9] - itrinti irasa \n"
                    + "[x] - baigti darba");
            command = sc.nextLine();
            switch (command) {
                case "1":
                    biudzetas.pridetiIrasa();
                    break;
                case "2":
                    biudzetas.gautiIrasus(Category.PAJAMOS);
                    break;
                case "3":
                    biudzetas.gautiIrasus(Category.ISLAIDOS);
                    break;
                case "4":
                    biudzetas.redaguotiIrasa();
                    break;
                case "5":
                    biudzetas.atnaujintiIrasa();
                    break;
                case "6":
                    biudzetas.gautiBalansa();
                    break;
                case "9":
                    biudzetas.trintiIrasa();
                    break;
                case "x":
                    isRunning = false;
                    System.out.println("Darbas baigtas");
                    break;
                default:
                    System.out.println("ivedete neteisinga veiksma \n veskite dar karta");
            }
        }
        sc.close();
    }
}