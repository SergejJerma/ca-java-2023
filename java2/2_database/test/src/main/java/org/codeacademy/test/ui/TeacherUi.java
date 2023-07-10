package org.codeacademy.test.ui;

import org.codeacademy.test.model.Answer;
import org.codeacademy.test.model.Question;
import org.codeacademy.test.model.QuestionDao;
import org.codeacademy.test.user.User;

import java.util.List;
import java.util.Scanner;

public class TeacherUi {

    private final Scanner scanner;
    private QuestionDao questionDao;

    public TeacherUi(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public void run(User user) {
        boolean run = true;
        do {
            System.out.println("Ka veikiam?");
            System.out.println("[1] Kuriam nauja klausima");
            System.out.println("[2] Perziureti klausimus");
            System.out.println("[3] Trinti klausimus");
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    createQuestion();
                    break;
                case "2":
                    showQuestions();
                    break;
                case "3":
                    deleteQuestions();
                    break;
                case "q":
                    run = false;
                    break;
            }
        } while (run);
    }

    private void deleteQuestions() {
        int id = getCleanUserInputInt("Kuri klausima trinti? [id]");
        questionDao.deleteById(id);
    }

    private void showQuestions() {
        List<Question> questions = questionDao.findAll();
        questions.forEach(System.out::println);
    }

    private void createQuestion() {
        System.out.println("Klausimo tekstas?: ");
        String text = scanner.nextLine();
        Question question = new Question(text);

        addAnswerToQuestion(question);
        addAnswerToQuestion(question);
        addAnswerToQuestion(question);

        questionDao.save(question);
    }

    private void addAnswerToQuestion(Question question) {
        System.out.println("Atsakymo variantas?: ");
        String text = scanner.nextLine();
        boolean correct = getCleanUserInputInt("Ar tai teisingas atsakymas? [0, 1]") != 0;
        Answer answer = new Answer(text, correct);
        question.addAnswer(answer);
    }

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
