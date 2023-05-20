package level1.lesson8;

public class SfTask2 {
    public static void main(String[] args) {
        System.out.println(String.format("|%20s|", "Aš"));
        System.out.println(String.format("|%20s|", "tikrai"));
        System.out.println(String.format("|%20s|", "išmoksiu"));
        System.out.println(String.format("|%20s|", "programuoti"));
        System.out.println(String.format("|%-20s|", "Java"));
//arba
        System.out.println(String.format("|%20s|\n|%20s|\n|%20s|\n|%20s|\n|%-20s|",
                "Aš", "tikrai", "išmoksiu", "programuoti", "Java"));
    }
}
