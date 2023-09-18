package com.codeacademy.thymeleaf_blog.service;

import com.codeacademy.thymeleaf_blog.entities.Comment;
import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.entities.User;
import com.codeacademy.thymeleaf_blog.repo.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final UserService userService;
    private final TopicService topicService;

    public CommentService(CommentRepository commentRepository, UserService userService, TopicService topicService) {
        this.commentRepository = commentRepository;
        this.userService = userService;
        this.topicService = topicService;
    }

    public void addComment(long topicId, Comment comment, User user) {
        user = userService.findById(user.getId());
        Topic topic = topicService.getTopic(topicId)
                .orElseThrow(() -> new IllegalArgumentException("Topics with id %d does not exist"));

        topic.addComment(comment);
        user.addComment(comment);

        commentRepository.save(comment);
    }
}