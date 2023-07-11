package org.codeacademy.test.exam;

import jakarta.persistence.*;
import lombok.Data;
import org.codeacademy.test.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne(fetch = FetchType.LAZY)
    @OneToOne
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
        return "Exam{" +
                "id=" + id +
//                ", user=" + user.getUsername() +
                ", examQuestions=" + examQuestions +
                ", dateCompleted=" + dateCompleted +
                '}';
    }
}
