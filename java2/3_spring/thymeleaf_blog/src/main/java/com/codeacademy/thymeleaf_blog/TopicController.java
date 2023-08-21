package com.codeacademy.thymeleaf_blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/topics")
public class TopicController {

    private final TopicDao topicDao;

    public TopicController(TopicDao topicDao) {
        this.topicDao = topicDao;
    }

    @GetMapping
    public String getTopics(Model model) {

//        List<Topic> topics = List.of(
//                new Topic("Most popular films", "More info"),
//                new Topic("Top rated films", "More info"),
//                new Topic("Latest movies", "More info"),
//                new Topic("Most expensive movies", "More info")
//        );

        List<Topic> topics = topicDao.getAllTopics();

        model.addAttribute("topics", topics);
        return "topics";
    }
}
