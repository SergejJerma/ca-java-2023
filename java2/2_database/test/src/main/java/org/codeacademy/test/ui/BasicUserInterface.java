package org.codeacademy.test.ui;

import org.codeacademy.test.exam.ExamDao;
import org.codeacademy.test.exam.QuestionDao;
import org.codeacademy.test.user.User;
import org.codeacademy.test.user.UserDao;

import java.util.Scanner;

public abstract class BasicUserInterface {

    protected final Scanner scanner;
    protected QuestionDao questionDao;
    protected ExamDao examDao;
    protected UserDao userDao;

    public BasicUserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public void setExamQuestionDao(ExamDao examDao) {
        this.examDao = examDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public abstract void run(User user);

    public int getCleanUserInputInt(String userPrompt){
        while (true) {
            System.out.println(userPrompt);
            String result = scanner.nextLine().trim();
            try {
                return Integer.parseInt(result);
            } catch (NumberFormatException ignore) {
            }
        }
    }
}
