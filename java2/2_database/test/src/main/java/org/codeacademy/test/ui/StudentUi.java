package org.codeacademy.test.ui;

import org.codeacademy.test.exam.Exam;
import org.codeacademy.test.user.User;

import java.util.List;
import java.util.Scanner;

public class StudentUi extends BasicUserInterface {

    public StudentUi(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void run(User user) {
        boolean run = true;
        do {
            System.out.println("Ka veikiam?");
            System.out.println("[1] Perziurim priskirtus egzaminus");
            String answer = scanner.nextLine();

            switch (answer) {
                case "1":
                    showExams(user);
                    break;
                case "q":
                    run = false;
                    break;
            }
        } while (run);


    }

    private void showExams(User user) {
//        List<Exam> exams = examDao.findAllByStudent(user);
//        exams.forEach(System.out::println);
        System.out.println(user.getExam());
    }


}
