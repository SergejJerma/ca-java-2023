package com.codeacademy.thymeleaf_blog.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TopicDto {

    private Long id;
    private String title;
    private String header;
    private List<Long> commentIds;

}
