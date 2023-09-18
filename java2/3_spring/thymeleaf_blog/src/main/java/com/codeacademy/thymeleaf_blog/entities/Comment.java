package com.codeacademy.thymeleaf_blog.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name="topic_id", nullable=false)
    private Topic topic;

    @ManyToOne
    private User createdBy;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", topic=" + (topic == null? "null": topic.getId()) +
                ", createdBy=" + createdBy +
                '}';
    }
}
