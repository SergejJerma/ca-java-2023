import java.io.Serializable;

public class ExampleA implements Serializable {
    private String name;
    private String surname;
    private transient Integer age;

    public ExampleA(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ExampleA{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
