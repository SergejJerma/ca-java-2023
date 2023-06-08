import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UserInterface userInterface = new UserInterface(() -> scanner.nextLine(), s -> System.out.println(s));
    static ListCutter cutter = new ListCutter();

    public static void main(String[] args) {
        List<String> zodziai = userInterface.getWordList();
        int[] ribos = userInterface.getListBounds();

        List<String> resultatas = cutter.cut(zodziai, ribos[0], ribos[1]);
        userInterface.showResult(zodziai, ribos, resultatas);
    }
}
