package com.codeacademy.thymeleaf_blog.controller;

import com.codeacademy.thymeleaf_blog.entities.Comment;
import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.service.CommentService;
import com.codeacademy.thymeleaf_blog.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/topics")
public class TopicController {

    private final TopicService topicService;
    private final CommentService commentService;

    public TopicController(TopicService topicService, CommentService commentService) {
        this.topicService = topicService;
        this.commentService = commentService;
    }

    @GetMapping("/filter")
    public String filterTopics(@RequestParam String topicTitle, Model model) {
        List<Topic> topics = topicService.findTopicsByTitle(topicTitle);
        model.addAttribute("topics", topics);
        return "topics";
    }

    @GetMapping
    public String getTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("topics", topics);
        return "topics";
    }

    @GetMapping("/{id}")
    public String getTopic(@PathVariable Long id,  Model model) {
        model.addAttribute("id", id);
        model.addAttribute("comment", new Comment());
        Topic topic = topicService.getTopic(id);
        model.addAttribute("topic", topic);
        return "topic";
    }

    @PostMapping("/{id}")
    public String addCommentToTopic(@PathVariable Long id, Comment comment, Model model) {
        Topic topic = topicService.getTopic(id);
        comment.setTopic(topic);
        commentService.addCommentToTopic(comment);
        return "redirect:/topics/" + id;
    }



    @GetMapping("/add")
    public String getAddTopicForm(Model model) {
        model.addAttribute("newTopic", new Topic());
        return "addTopic";
    }

    @PostMapping
    public String postTopics(Topic newTopic, Model model) {

        System.out.println(newTopic);

        Topic savedTopic = topicService.addNewTopic(newTopic);
        model.addAttribute("newTopic", savedTopic);
        model.addAttribute("comment", new Comment());
        return "topic";
    }
}
