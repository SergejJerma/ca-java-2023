package org.codeacademy.test.ui;

import org.codeacademy.test.exam.Answer;
import org.codeacademy.test.exam.Exam;
import org.codeacademy.test.exam.ExamQuestion;
import org.codeacademy.test.exam.Question;
import org.codeacademy.test.user.User;

import java.util.List;
import java.util.Scanner;

import static org.codeacademy.test.ui.UserInterfaceCommand.CANCEL;
import static org.codeacademy.test.ui.UserInterfaceCommand.SAVE;

public class TeacherUi extends BasicUserInterface {

    public TeacherUi(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void run(User user) {
        boolean run = true;
        do {
            System.out.println("Ka veikiam?");
            System.out.println("[1] Kuriam nauja klausima");
            System.out.println("[2] Perziureti klausimus");
            System.out.println("[3] Keisti klausima");
            System.out.println("[4] Trinti klausimus");
            System.out.println("[5] Sudaryti egzamina");
            System.out.println("[6] Priskirti egzamina studentams");
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    createQuestion();
                    break;
                case "2":
                    showQuestions();
                    break;
                case "3":
                    updateQuestion();
                    break;
                case "4":
                    deleteQuestion();
                    break;
                case "5":
                    createExam();
                    break;
                case "6":
                    assignExam();
                    break;
                case "q":
                    run = false;
                    break;
            }
        } while (run);
    }

    private void assignExam() {
        System.out.println("Kuri egzamina kuriam studentui priskirti?");
        int egzamId = getCleanUserInputInt("Kuri egzamina (-1 = nutraukti;)? [id]");
        Exam exam = examDao.getExamById(egzamId);
        if (egzamId == CANCEL.id())
            return;
        int studentId = getCleanUserInputInt("Kuriam studentui priskirti (-1 = nutraukti;)? [id]");
        if (studentId == CANCEL.id())
            return;
        User student = userDao.getUserById(studentId);
        exam.setUser(student);
        examDao.save(exam);
    }

    private void createExam() {
        Exam exam = new Exam();
        int questionId = 0;
        while (questionId != CANCEL.id() && questionId!= SAVE.id()) {
            questionId = getCleanUserInputInt("Kuri klausima itraukti i egzamina (-1 = nutraukti; -2 = saugoti)? [id]");
            Question question = questionDao.getQuestionById(questionId);
            ExamQuestion examQuestion = new ExamQuestion(exam, question);
            exam.addQuestion(examQuestion);
        }
        if (questionId == SAVE.id())
            examDao.save(exam);
    }

    private void updateQuestion() {
        int id = getCleanUserInputInt("Kuri klausima pakeisti? [id]");
        Question question = questionDao.getQuestionById(id);

        while (true) {
            String prompt = "Ka norite keisti?" +
                    "\n\t[0] Klausimo teksta" +
                    "\n\t[1] Atsakyma nr. 1" +
                    "\n\t[2] Atsakyma nr. 2" +
                    "\n\t[3] Atsakyma nr. 3" +
                    "\n\t[-1] atgal";

            int result = getCleanUserInputInt(prompt);

            if (result == CANCEL.id()) {
                return;
            }
            else if (result == 0) {
                System.out.println("Klausimo tekstas: ");
                String text = scanner.nextLine();
                question.setText(text);
            } else {
                Answer answer = getAnswer();
                Answer existingAnswer = question.getAnswers().get(result);
                existingAnswer.setText(answer.getText());
                existingAnswer.setCorrect(answer.isCorrect());
            }
            questionDao.save(question);
        }
    }

    private void deleteQuestion() {
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
        Answer answer = getAnswer();
        question.addAnswer(answer);
    }

    private Answer getAnswer() {
        System.out.println("Atsakymo variantas?: ");
        String text = scanner.nextLine();
        boolean correct = getCleanUserInputInt("Ar tai teisingas atsakymas? [0, 1]") != 0;
        Answer answer = new Answer(text, correct);
        return answer;
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
