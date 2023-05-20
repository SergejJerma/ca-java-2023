package level1.tasks.student;

public class Student {
    private Integer studentId;
    private String name;
    private Integer year;

    public Student(Integer studentId, String name, Integer year) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
