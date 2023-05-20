package level1.lesson7.test.q18;

public class Example18 {
    public static void main(String[] args) {
        String[] a = new String[4];


        for (int i = 0; i < a.length; i+=2) {
            a[i] = "Var" + i;
        }


        if (a[3] == "Var3"){ // false
            System.out.println("Laba");
        }
        if (a[3].equals("Var3")){ //true
            System.out.println("Laba");
        }
        System.out.println("diena");
    }
}
