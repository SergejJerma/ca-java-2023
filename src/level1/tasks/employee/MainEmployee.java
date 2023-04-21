package level1.tasks.employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(200.0, "developer", 40);
        System.out.println(employee);

        employee.printSalaryAndWorkHoursInfo();
        System.out.println(employee);
        employee.addSalaryAndWorkHours(20);
        System.out.println(employee);
        employee.checkAndAddSalary();
        System.out.println(employee);
    }
}
