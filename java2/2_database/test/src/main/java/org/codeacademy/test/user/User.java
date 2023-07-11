package org.codeacademy.test.user;

import jakarta.persistence.*;
import lombok.Data;
import org.codeacademy.test.exam.Exam;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean teacher;

    private String username;

    private String password;

//    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    @OneToOne(mappedBy = "user")
    @PrimaryKeyJoinColumn
    private Exam exam;

    @Override
    public String toString() {
        return String.format("User{ id: %s, username: %s, isTeacher: %b }", id, username, teacher);
    }
}
