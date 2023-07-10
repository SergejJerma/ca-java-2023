package org.codeacademy.test.exam;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @OneToMany(
            mappedBy = "question",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Answer> answers = new ArrayList<>();

    @OneToMany(
            mappedBy = "question",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ExamQuestion> examQuestions = new ArrayList<>();

    public Question(String text) {
        this.text = text;
    }

    public void setAnswers(List<Answer> answers) {
        for (Answer answer : answers)
            answer.setQuestion(this);
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {
        answer.setQuestion(this);
        answers.add(answer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Question: id:%s, text: %s\n", id, text));
        for (Answer answer : answers)
            sb.append("\n\t").append(answer.toString());

        return sb.toString();
    }
}
