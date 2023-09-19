package com.codeacademy.thymeleaf_blog.controller;

import com.codeacademy.thymeleaf_blog.entities.Topic;
import com.codeacademy.thymeleaf_blog.service.TopicService;
import com.codeacademy.thymeleaf_blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


// test slice
@WebMvcTest(TopicController.class)
class TopicControllerTest {

    @MockBean
    private TopicService topicService;

    @MockBean
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getTopic_topicExists_returnsTopicPage() throws Exception {
        //given
        long givenTopicId = 1L;
        Topic givenTopicFoundInDb = new Topic();
        givenTopicFoundInDb.setId(givenTopicId);
        givenTopicFoundInDb.setHeader("Some very special topic header");
        givenTopicFoundInDb.setTitle("Some very special topic title");

        when(topicService.getTopic(givenTopicId)).thenReturn(Optional.of(givenTopicFoundInDb));

        //when-then
        mockMvc.perform(get("/topics/%d".formatted(givenTopicId)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("topic"))
                .andExpect(model().attributeExists("topic"))
                .andExpect(content().string(containsString("Some very special topic title")))
                .andExpect(content().string(containsString("Some very special topic header")));
//  xpath matcher is supposed to verify xml  (html is extension of it, containing lots of new things, not allowed by xpath)
//  ... you're gonna use it fot verifying SOAP services
//                .andExpect(xpath("/html/body/main/div/h3").string("Some very special topic title"))
//                .andExpect(xpath("/html/body/main/div/section").string("Some very special topic header"));
    }

    @Test
    void addNewTopic_userNotLoggedIn_redirectsToLogin() throws Exception {
        //given
        long givenTopicId = 1L;
        Topic userSubmittedNewTopic = new Topic();
        userSubmittedNewTopic.setId(givenTopicId);
        userSubmittedNewTopic.setHeader("Some very special topic header");
        userSubmittedNewTopic.setTitle("Some very special topic title");

        //when-then
        mockMvc.perform(post("/topics/add")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("title", "Some very special topic title")
                        .param("header", "Some very special topic header")
                )
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrlPattern("**/login"));
    }

    @WithMockUser(roles = "USER")
    @Test
    void deleteTopic_userNotAdmin_redirectsToLogin() throws Exception {
        mockMvc.perform(delete("/topics/delete/1"))
                .andDo(print())
                .andExpect(view().name("customError"))
                .andExpect(model().attribute("message", "Access is denied"));

        verify(topicService, times(0)).deleteTopic(any());
    }
}