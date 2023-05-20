package level1.lesson14.animal;

public interface A  {
    String field = "CONST";
    void aMeth();

    void bMeth();

    default void defMeth() {
        System.out.println("def meth interf");
    }
}
