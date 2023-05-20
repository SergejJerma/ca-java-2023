package level1.lesson20.varargs;

public class VarargTest {
    public static void main(String[] args) {

        int suma1 = sudetiSkaicius(1, 2);
        int suma2 = sudetiSkaicius(1, 2, 5);
        int suma3 = sudetiSkaicius(1, 2, 4, 6);

        int suma0 = sudetiSkaicius();

        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(suma3);

    }

    private static int sudetiSkaicius(int... skaiciai) {
        int rez = 0;
        for (int i : skaiciai) {
            rez += i;
        }
        return rez;
    }

}
