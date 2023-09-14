package com.codeacademy.thymeleaf_blog.service;

import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.repo.TopicRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public Topic addNewTopic(Topic newTopic) {
        return topicRepository.save(newTopic);
    }

    public Topic getTopic(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    public List<Topic> filterTopicsByKeyword(String keyword) {
        return topicRepository.findTopicsByKeyword(keyword);
    }
    public Page<Topic> findPaginated(Pageable pageable) {
        return topicRepository.findAll(pageable);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
