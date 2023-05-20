package level1.tasks.lecture11.task4.student;

public class Student {

    private static int studentCount = 0;

    private final int id;
    private String firstName;
    private String lastName;
    private String university;

    public Student(String firstName, String lastName, String university) {
        this.id = studentCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
