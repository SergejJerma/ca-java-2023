package level1.tasks.lecture11.task4.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Menu:\n" +
                "\t[1] – įvesti studentą;\n" +
                "\t[2] – gauti studentą pagal numerį;\n" +
                "\t[3] – baigti programą.\n";

        Map<Integer, Student> studentMap = new HashMap<>();
        boolean proceed = true;
        while (proceed) {
            System.out.println(menu);
            String selection = scanner.nextLine();

            switch (selection) {
                case "1":
                    Student student = requestStudent(scanner);
                    studentMap.put(student.getId(), student);
                    break;
                case "2":
                    int studentId = requestStudentId(scanner);
                    Student studentFound = studentMap.get(studentId);
                    if (studentFound == null)
                        System.out.printf("Studentas id=%d nerastas%n", studentId);
                    else
                        System.out.println(studentFound);
                    break;
                case "3":
                    System.out.println("Ate!");
                    proceed = false;
                    break;
                default:
                    System.out.println("Bloga komanda");
            }
        }
    }

    private static int requestStudentId(Scanner scanner) {
        while (true) {
            System.out.println("Iveskite studento id");
            try {
                String idStr = scanner.nextLine();
                return Integer.parseInt(idStr);
            } catch (NumberFormatException e) {
                System.out.println("Blogas id - iveskite skaiciu");
            }
        }
    }

    private static Student requestStudent(Scanner scanner) {
        System.out.println("Iveskite studento varda");
        String firstName = scanner.nextLine();
        System.out.println("Iveskite studento pavarde");
        String lastName = scanner.nextLine();
        System.out.println("Iveskite studento universiteta");
        String university = scanner.nextLine();

        return new Student(firstName, lastName, university);
    }
}
