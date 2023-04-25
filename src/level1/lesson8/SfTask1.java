package level1.lesson8;

public class SfTask1 {
    public static void main(String[] args) {
        String vardas = "Petras";
        String pavarde = "Petraitis";
        int gimimoMetai = 1977;
        double ugis = 1.90f;

        System.out.println(String.format("Asmens %s %s, gimusio %dm., ugis yra %.2fm.", vardas, pavarde, gimimoMetai, ugis));
    }
}
