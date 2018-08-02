package com.boardgame.comdemo.controller;

import com.boardgame.comdemo.ComDemoApplication;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.service.UserProfilService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

   /* @Test
    public void showUserTestWhenExist() {
        // given
        TestRestTemplate restTemplate = new TestRestTemplate();
        String fooResourceUrl = "http://localhost:8080/find";

        // when
        ResponseEntity<UserDTO> response = restTemplate.getForEntity(fooResourceUrl + "?email=adammalysz@gmail.com", UserDTO.class);

        // then
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals("Adam", response.getBody().getFirstname());
    }*/


    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Mock
    private UserProfilService userProfileService;

    @Autowired
    private UserController userController;



    @Test
    public void shouldRequestGETonGetBookMethod()throws Exception{
        // when
        ResultActions resultActions = mockMvc.perform(put("users/update"));
        // then
        resultActions.andExpect(status().isOk());
    }



}