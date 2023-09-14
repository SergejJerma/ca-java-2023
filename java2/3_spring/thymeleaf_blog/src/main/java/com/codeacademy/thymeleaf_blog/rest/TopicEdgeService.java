package com.codeacademy.thymeleaf_blog.rest;

import com.codeacademy.thymeleaf_blog.entities.Comment;
import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.rest.dto.TopicDto;
import com.codeacademy.thymeleaf_blog.service.TopicService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicEdgeService {

    private final TopicService topicService;

    public TopicEdgeService(TopicService topicService) {
        this.topicService = topicService;
    }

    public Page<TopicDto> findPaginated(Pageable pageable) {
        return topicService.findPaginated(pageable)
                .map(this::toTopicDto);
    }

    public TopicDto getTopic(long topidId) {
        Topic topic = topicService.getTopic(topidId);
        if (topic == null) {
            return null;
        }
        return toTopicDto(topic);
    }

    private TopicDto toTopicDto(Topic topic) {
        TopicDto topicDto = new TopicDto();
        topicDto.setId(topic.getId());
        topicDto.setTitle(topic.getTitle());
        topicDto.setHeader(topic.getHeader());

        List<Long> comments = topic.getComments().stream()
                .map(Comment::getId)
                .toList();
        topicDto.setCommentIds(comments);
        return topicDto;
    }
}
