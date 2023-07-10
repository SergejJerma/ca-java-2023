package org.codeacademy.test.exam;

import jakarta.persistence.*;
import lombok.Data;
import org.codeacademy.test.user.User;

import java.util.List;

@Data
@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @OneToMany(
            mappedBy = "exam",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ExamQuestion> examQuestions;

}
