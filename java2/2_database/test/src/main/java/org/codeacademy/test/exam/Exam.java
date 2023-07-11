package org.codeacademy.test.exam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.codeacademy.test.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(
            mappedBy = "exam",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ExamQuestion> examQuestions = new ArrayList<>();

    private LocalDateTime dateCompleted;

    public void addQuestion(ExamQuestion examQuestion) {
        examQuestion.setExam(this);
        examQuestions.add(examQuestion);
    }

    @Override
    public String toString() {
        return String.format("Exam{id:%d, title:'%s', dateCompleted: %s}", id, title, dateCompleted);
    }
}
