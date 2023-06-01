package polymorphism.keywords;

public class Son {
    String mommy;

    Integer age;

    public Son(String mommy) {
        this.mommy = mommy;
    }

    public Son(Integer age) {
    this("xxx");
        this.age = age;
    }

}
