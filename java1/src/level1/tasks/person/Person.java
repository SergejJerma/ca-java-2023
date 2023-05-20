package level1.tasks.person;

public class Person {
    private String name;
    private String surname;

    private Integer age;

    private void printName(String name) {
        System.out.println(">>>>>" + name);
    }

    public void printSurname() {
        System.out.println(surname);
    }

    public String getNameAndSurname() {
        return name + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        printName(name);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
