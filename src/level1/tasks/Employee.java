package level1.tasks;

public class Employee {
    private Double salary;
    private String position;
    private Integer workHours;

    public Employee() {
    }

    public Employee(Double salary, String position, Integer workHours) {
        this.salary = salary;
        this.position = position;
        this.workHours = workHours;
    }

    public void printSalaryAndWorkHoursInfo() {
        System.out.println("Salary: " + salary + " Work hours: " + workHours);
    }

    public void checkAndAddSalary() {
        if (salary <= 500) {
            salary += 10;
        }
    }

    public void addSalaryAndWorkHours(Integer workHours) {
        salary += 5;
        this.workHours += workHours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", workHours=" + workHours +
                '}';
    }
}
