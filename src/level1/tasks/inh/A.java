package level1.tasks.inh;

public class A {
    public String name;

    public final void print() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
