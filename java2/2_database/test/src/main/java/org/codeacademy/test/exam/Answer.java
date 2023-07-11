package org.codeacademy.test.exam;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private boolean correct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToMany(
            mappedBy = "givenAnswer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ExamQuestion> examQuestions = new ArrayList<>();

    public Answer(String text) {
        this.text = text;
        this.correct = false;
    }

    public Answer(String text, boolean isCorrect) {
        this.text = text;
        this.correct = isCorrect;
    }

    @Override
    public String toString() {
        return String.format("Answer{ id: %d, , text: %s, correct: %s}", id, text, correct);
    }
}
