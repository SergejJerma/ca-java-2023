package com.codeacademy.thymeleaf_blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/topics")
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public String getTopics(Model model) {

//        List<Topic> topics = List.of(
//                new Topic("Most popular films", "More info"),
//                new Topic("Top rated films", "More info"),
//                new Topic("Latest movies", "More info"),
//                new Topic("Most expensive movies", "More info")
//        );

        List<Topic> topics = topicService.getAllTopics();

        model.addAttribute("topics", topics);
        model.addAttribute("newTopic", new Topic());

        return "topics";
    }

    @PostMapping
    public String postTopics(Topic newTopic, Model model) {

        System.out.println(newTopic);

        Topic savedTopic = topicService.addNewTopic(newTopic);
        model.addAttribute("newTopic", savedTopic);
        return "topic";
    }
}
