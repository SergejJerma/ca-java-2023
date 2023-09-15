package com.codeacademy.thymeleaf_blog.controller;

import com.codeacademy.thymeleaf_blog.entities.Comment;
import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.entities.User;
import com.codeacademy.thymeleaf_blog.service.CommentService;
import com.codeacademy.thymeleaf_blog.service.TopicService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class CommentController {

    private final TopicService topicService;
    private final CommentService commentService;

    public CommentController(TopicService topicService, CommentService commentService) {
        this.topicService = topicService;
        this.commentService = commentService;
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @PostMapping
    public String addCommentToTopic(@AuthenticationPrincipal User user, Long id, Comment comment, Model model) {
        Topic topic = topicService.getTopic(id).orElse(null);
        comment.setCreatedBy(user);
        comment.setTopic(topic);
        commentService.addCommentToTopic(comment);
        /*
         * If Post-Redirect-Get pattern is not used then
         * after user does POST, and gets server response,
         * the last request made is POST.
         * PROBLEM: if user presses refresh button - user makes last request (POST)
         * and once more sends the last request to the server (thus duplicate data can occur on the server).
         * (uncomment to try it out)
         * */
//        model.addAttribute("topic", topic);
//        return "topic";
        return "redirect:/topics/" + id;
    }
}
