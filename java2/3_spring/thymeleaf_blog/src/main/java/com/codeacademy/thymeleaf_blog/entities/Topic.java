package com.codeacademy.thymeleaf_blog.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Title cannot be empty.")
    private String title;
    private String header;

    @OneToMany(mappedBy = "topic", orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

}
