package com.codeacademy.thymeleaf_blog.controller;

import com.codeacademy.thymeleaf_blog.entities.Comment;
import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.service.CommentService;
import com.codeacademy.thymeleaf_blog.service.TopicService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/topics")
public class TopicController {

    private final TopicService topicService;
    private final CommentService commentService;

    public TopicController(TopicService topicService, CommentService commentService) {
        this.topicService = topicService;
        this.commentService = commentService;
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
        /*
         * If Post-Redirect-Get pattern is not used then
         * after user does POST, and gets server response,
         * the last request made is POST.
         * PROBLEM: if user presses refresh button - user makes last request (POST)
         * and once more sends the last request to the server (thus duplicate data can occur on the server.
         * (uncomment to try it out)
         * */
//        model.addAttribute("topic", topic);
//        return "topic";
        return "redirect:/topics/" + id;
    }

    @GetMapping("/add")
    public String getAddTopicForm(Topic topic) {
        return "addTopic";
    }

    @PostMapping("/add")
    public String addNewTopic(@Valid Topic topic, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addTopic";
        }
        topicService.addNewTopic(topic);
        return "redirect:/topics";
    }
    @GetMapping("/filter")
    public String filterTopics(@RequestParam String keyword, Model model) {
        List<Topic> topics = topicService.filterTopicsByKeyword(keyword);
        model.addAttribute("topics", topics);
        return "topics";
    }

    /**
     * List topics using pageable
     * Request example:
     *  http://localhost:8080/topics?size=3&page=0&sort=title,asc
     */
    @GetMapping
    public String listTopics(Model model,
                             @PageableDefault(sort = { "title"}, direction = Sort.Direction.DESC, size = 2, page = 1)
                             Pageable pageable)
    {
        Page<Topic> topicsPage = topicService.findPaginated(pageable);
        model.addAttribute("topics", topicsPage);

        int totalPages = topicsPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(0, totalPages - 1)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        return "topics";
    }

    @GetMapping("/exception")
    public String getException() {
        return topicService.throwException();
    }

    @ExceptionHandler
    public String handleException(CustomStatusException exception, Model model) {
        model.addAttribute("errorId", UUID.randomUUID().toString());
        model.addAttribute("message", exception.getMessage());
        return  "customError";
    }

}
