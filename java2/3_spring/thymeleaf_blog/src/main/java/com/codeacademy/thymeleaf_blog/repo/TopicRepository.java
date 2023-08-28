package com.codeacademy.thymeleaf_blog.repo;

import com.codeacademy.thymeleaf_blog.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findByTitle(String topicTitle);
}
