package org.codeacademy.test;

import org.codeacademy.test.exam.*;
import org.codeacademy.test.user.User;
import org.codeacademy.test.user.UserDao;

import java.util.List;
import java.util.stream.Collectors;

public class Initializer {

    private final UserDao userDao;
    private final QuestionDao questionDao;
    private final ExamDao examQuestionDao;

    public Initializer(UserDao userDao, QuestionDao questionDao, ExamDao examQuestionDao) {
        this.userDao = userDao;
        this.questionDao = questionDao;
        this.examQuestionDao = examQuestionDao;
    }

    public void initialize() {
        List<User> users = setupUsers();
        List<Question> questions = setupQuestionAndAnswers();
        User student = users.stream()
                .filter(u -> Boolean.FALSE.equals(u.isTeacher()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No student found"));
        List<Exam> exams = setupExamQuestionsForStudent(questions, student);
    }

    private List<Exam> setupExamQuestionsForStudent(List<Question> questions, User user) {
        Exam exam1 = new Exam();
        exam1.setUser(user);

        List<ExamQuestion> examQuestions = questions.stream()
                .map(q -> new ExamQuestion(exam1, q))
                .collect(Collectors.toList());

        exam1.setExamQuestions(examQuestions);

        examQuestionDao.save(exam1);
        return List.of(exam1);
    }

    private List<Question> setupQuestionAndAnswers() {
        Question question1 = new Question("Color of the grass");
        Answer answer11 = new Answer("Red");
        Answer answer12 = new Answer("Green", true);
        Answer answer13 = new Answer("Yellow");
        question1.setAnswers(List.of(answer11, answer12, answer13));
        questionDao.save(question1);

        Question question2 = new Question("Color of the sky");
        Answer answer21 = new Answer("Red");
        Answer answer22 = new Answer("Green");
        Answer answer23 = new Answer("Blue", true);
        question2.setAnswers(List.of(answer21, answer22, answer23));
        questionDao.save(question2);

        return List.of(question1, question2);
    }

    private List<User> setupUsers() {
        User teacher = new User();
        teacher.setUsername("teacher");
        teacher.setPassword("password");
        teacher.setTeacher(true);
        userDao.save(teacher);

        User student = new User();
        student.setUsername("user");
        student.setPassword("password");
        userDao.save(student);

        return List.of(teacher, student);
    }
}
