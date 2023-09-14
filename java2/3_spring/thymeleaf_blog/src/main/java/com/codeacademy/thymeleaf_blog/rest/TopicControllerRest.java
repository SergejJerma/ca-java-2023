package com.codeacademy.thymeleaf_blog.rest;

import com.codeacademy.thymeleaf_blog.rest.dto.TopicDto;
import com.ctc.wstx.shaded.msv_core.util.Uri;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

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

//    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    @GetMapping(path = "/{id}")
    public ResponseEntity<TopicDto> getTopic(@PathVariable long id) {
        return ResponseEntity.of(topicService.getTopic(id));
    }

    @PostMapping
    public ResponseEntity<TopicDto> getTopic(@RequestBody TopicDto topic, HttpServletRequest request) {
        TopicDto topicDto = topicService.addTopic(topic);
        URI uri = URI.create(request.getRequestURL().toString().concat("/%d".formatted(topicDto.getId())));
        return ResponseEntity.created(uri)
                .body(topicDto);
    }
}
