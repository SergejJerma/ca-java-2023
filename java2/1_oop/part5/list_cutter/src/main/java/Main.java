import java.util.List;

public class Main {

    static UserInterface userInterface = new UserInterface();
    static ListCutter cutter = new ListCutter();

    public static void main(String[] args) {
        List<String> zodziai = userInterface.getWordList();
        int[] ribos = userInterface.getListBounds();

        List<String> resultatas = cutter.cut(zodziai, ribos[0], ribos[1]);
        System.out.println(userInterface.formatResult(zodziai, ribos, resultatas));

    }
}
