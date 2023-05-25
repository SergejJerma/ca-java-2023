package loops;

public class AnotherWay {

    //Manto Sasnausko sprendimas
    public static void main(String[] args) {
        String zvaigzdutes = "*";
        for (int i = 11; i > 0; i--) {
            System.out.printf("%" + i + "s%s%n", "", zvaigzdutes);
            zvaigzdutes += "**";
        }
    }

}
