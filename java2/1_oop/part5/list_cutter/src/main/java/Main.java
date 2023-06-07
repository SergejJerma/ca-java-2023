import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ListCutter cutter = new ListCutter();

    public static void main(String[] args) {
        System.out.println("Pateikite [zodziu sarasa]");
        String visiZodziai = scanner.nextLine();

        List<String> zodziai = List.of(visiZodziai.split(" "));

        System.out.println("Kurios zodzius isrinkti? [int:nuo int:iki]: ");
        String ruozas = scanner.nextLine();
        String[] ruozasArr = ruozas.split(" ");
        int pradziosIndexas = Integer.parseInt(ruozasArr[0]);
        int pabaigosIndexas = Integer.parseInt(ruozasArr[1]);

        List<String> resultatas = cutter.cut(zodziai, pradziosIndexas, pabaigosIndexas);
        System.out.printf("Pateiktame zodziu sarase:%n%s%nzodziai nuo %d iki %d yra:%n%s",
                zodziai,
                pradziosIndexas,
                pabaigosIndexas,
                resultatas
                );
    }
}
