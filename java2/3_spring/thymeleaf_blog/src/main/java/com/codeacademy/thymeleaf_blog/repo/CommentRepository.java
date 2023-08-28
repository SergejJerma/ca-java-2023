package com.codeacademy.thymeleaf_blog.repo;

import com.codeacademy.thymeleaf_blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}