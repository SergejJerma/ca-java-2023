package com.codeacademy.thymeleaf_blog.rest;

import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.rest.dto.TopicDto;
import com.codeacademy.thymeleaf_blog.service.TopicService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class TopicEdgeServiceTestUnitTest {

    @Mock
    private TopicService topicService;

    @InjectMocks
    private TopicEdgeService topicEdgeService;

    /* testuojamasMetodas_salyga_rezultatas */
    @Test
    void getTopic_topicExists_returnsTopic() {
        // given
        long givenTopicId = 1;
        Topic givenTopic = new Topic();
        givenTopic.setId(givenTopicId);

        Optional<Topic> givenTopicOptional = Optional.of(givenTopic);
        when(topicService.getTopic(any())).thenReturn(givenTopicOptional);

        //when
        Optional<TopicDto> topicDtoOptional = topicEdgeService.getTopic(givenTopicId);

        //then
        assertThat(topicDtoOptional).isNotEmpty();

        TopicDto topicDto = topicDtoOptional.get();
        assertThat(topicDto.getId()).isEqualTo(givenTopicId);
    }

    @Test
    void getTopic_topicDoesNotExist_returnsEmptyOptional() {
        // given
        long givenTopicId = 1;

        Optional<Topic> givenTopicOptional = Optional.empty();
        when(topicService.getTopic(any())).thenReturn(givenTopicOptional);

        //when
        Optional<TopicDto> topicDtoOptional = topicEdgeService.getTopic(givenTopicId);

        //then
        assertThat(topicDtoOptional).isEmpty();
    }

    /* testuojamasMetodas_salyga_rezultatas */
    @Test
    void updateTopic_topicExists_returnsUpdatedTopic() {
        // given
        long givenTopicId = 1;
        TopicDto givenTopicToUpdateDto = new TopicDto();
        givenTopicToUpdateDto.setId(givenTopicId);
        String titleToUpdate = "Attempt to update title";
        givenTopicToUpdateDto.setTitle(titleToUpdate);

        Topic topicFromDb = new Topic();
        topicFromDb.setId(givenTopicId);
        when(topicService.getTopic(any())).thenReturn(Optional.of(topicFromDb));
        when(topicService.save(any())).thenReturn(topicFromDb);

        //when
        TopicDto updatedTopic = topicEdgeService.updateTopic(givenTopicToUpdateDto);

        //then
        assertThat(updatedTopic).isNotNull();
        assertThat(updatedTopic.getId()).isEqualTo(givenTopicId);
        assertThat(updatedTopic.getTitle()).isEqualTo(titleToUpdate);

    }
}