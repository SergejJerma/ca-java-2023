package level1.tasks.student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student(101, "Jonas", 1999);
        System.out.println(student);

        if (student.getName() != null) {
            System.out.println(student.getName().toLowerCase());
        }
        student.setName("xxx");
        System.out.println(student);


        Student student1 = new Student(102, "Petras", 2000);
        student1.setName("zzz");
        System.out.println(student1);

    }
}