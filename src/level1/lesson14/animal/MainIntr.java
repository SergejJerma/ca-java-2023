package level1.lesson14.animal;

public class MainIntr {
    public static void main(String[] args) {
        A c = new C();
        c.aMeth();
        c.bMeth();
        c.defMeth();

        System.out.println(A.field);

        C c1= new C();
        c1.methC();
        c1.defMeth();
       }
}
