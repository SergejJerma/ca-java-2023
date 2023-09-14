package com.codeacademy.thymeleaf_blog.rest;

import com.codeacademy.thymeleaf_blog.rest.dto.TopicDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/topics")
@RestController
public class TopicControllerRest {

    private final TopicEdgeService topicService;

    public TopicControllerRest(TopicEdgeService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public ResponseEntity<Page<TopicDto>> listTopics(
            @PageableDefault(sort = { "title"}, direction = Sort.Direction.DESC, size = 2, page = 1) Pageable pageable) {
        Page<TopicDto> topics = topicService.findPaginated(pageable);
        return ResponseEntity.ok().body(topics);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicDto> getTopic(@PathVariable long id) {
        return ResponseEntity.of(topicService.getTopic(id));
    }
}
