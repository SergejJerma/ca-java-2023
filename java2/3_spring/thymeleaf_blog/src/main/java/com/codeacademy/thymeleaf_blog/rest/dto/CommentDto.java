package com.codeacademy.thymeleaf_blog.rest.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CommentDto {

    private Long id;
    private String text;
    private Long topicId;
}
