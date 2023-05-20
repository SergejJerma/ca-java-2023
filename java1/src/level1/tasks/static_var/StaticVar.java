package level1.tasks.static_var;

public class StaticVar {
    private Integer value;
    private static Integer privateStaticValue;

    public static Integer publicStaticValue;

    public void setValue(Integer value) {
        this.value = value;
    }

    public static void changeValue(int i) {
        privateStaticValue = i;
        publicStaticValue = i;
        System.out.println(privateStaticValue);
    }

    @Override
    public String toString() {
        return "StaticVar{" +
                "value=" + value +
                '}';
    }
}
