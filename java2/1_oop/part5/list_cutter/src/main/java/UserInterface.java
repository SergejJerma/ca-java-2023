import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public Scanner scanner = new Scanner(System.in);

    public List<String> getWordList() {
        System.out.println("Pateikite [zodziu sarasa]");
        String visiZodziai = scanner.nextLine();
        List<String> zodziai = List.of(visiZodziai.split(" "));
        return zodziai;
    }

    public int[] getListBounds() {
        System.out.println("Kurios zodzius isrinkti? [int:nuo int:iki]: ");
        String ruozas = scanner.nextLine();
        String[] ruozasArr = ruozas.split(" ");
        int pradziosIndexas = Integer.parseInt(ruozasArr[0]);
        int pabaigosIndexas = Integer.parseInt(ruozasArr[1]);
        return new int[]{pradziosIndexas, pabaigosIndexas};
    }

    public String formatResult(List<String> zodziai, int[] ribos, List<String> resultatas) {
        return String.format("Pateiktame zodziu sarase:%n%s%nzodziai nuo %d iki %d yra:%n%s",
                zodziai,
                ribos[0],
                ribos[1],
                resultatas
        );
    }
}
