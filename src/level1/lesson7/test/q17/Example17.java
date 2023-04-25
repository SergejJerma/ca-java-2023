package level1.lesson7.test.q17;

public class Example17 {
    public static void main(String[] args) {
        String ar1 = "Labas", ar2 = "Lab";
        if (17 % 2 == 1) {
            ar2 += "as"; // ar2 = ar2 + "as";  Labas
        }
        if (ar1 == ar2) {
            System.out.println("Lygu");
        }
        if (ar1.equals(ar2)) {
            System.out.println("Lygu equals");
        }

        System.out.println(ar2);
    }
}
