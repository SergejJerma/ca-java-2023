package org.codeacademy.test.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String text;

    private boolean correct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

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
        return String.format("Answer: id=%d, , text=%s, correct=%s", id, text, correct);
    }
}
