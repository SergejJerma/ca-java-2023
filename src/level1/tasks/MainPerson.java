package level1.tasks;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 =new Person();

        System.out.println(person);
        person.setName("Jonas");
        System.out.println(person);

        person.setSurname("Jonauskas");
        person1.setSurname("Sakalauskas");
        System.out.println(person);

        person.printSurname();
        person1.printSurname();

        System.out.println(person.getNameAndSurname());
        System.out.println(person1.getNameAndSurname());
    }
}
