package level1.tasks.static_var;

public class MainStatic {
    public static void main(String[] args) {
        StaticVar sv = new StaticVar();
        sv.setValue(10);
        System.out.println(sv);

        System.out.println(StaticVar.publicStaticValue);

        StaticVar.changeValue(100);

        System.out.println(StaticVar.publicStaticValue);
    }

}
