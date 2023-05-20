package level1.lesson16.tekstas;

public class MainText {
    public static void main(String[] args) {
        Info info = new Info(1, "labas tau pasaulis");
        String word = "Labas";
        String word1 = word.toLowerCase();
        System.out.println(info.isContains(word1));
    }
}
