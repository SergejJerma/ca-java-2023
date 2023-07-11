package org.codeacademy.test.ui;

import org.codeacademy.test.user.User;

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
                case "2":
                    solveExam(user);
                case "q":
                    run = false;
                    break;
            }
        } while (run);


    }

    //todo: implement process of solving exam
    private void solveExam(User user) {


    }

    private void showExams(User user) {
        System.out.println(user.getExam());
    }


}
