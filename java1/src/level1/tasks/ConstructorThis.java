package level1.tasks;

public class ConstructorThis {
    private String name;

    public ConstructorThis() {
        System.out.println("default");
    }

    public ConstructorThis(String name) {
        this(); //new ConstructorThis();
        System.out.println("su param");
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorThis ct = new ConstructorThis("xxx");
    }
}
