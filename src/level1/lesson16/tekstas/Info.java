package level1.lesson16.tekstas;


public class Info {
    private Integer id;
    private String text;

    public Info(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public boolean isContains(String word) {
        return this.text.contains(word);
    }
}
