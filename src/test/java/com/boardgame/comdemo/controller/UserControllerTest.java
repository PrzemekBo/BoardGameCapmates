package com.boardgame.comdemo.controller;

import com.boardgame.comdemo.ComDemoApplication;
import com.boardgame.comdemo.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ComDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {


    @Value("${local.server.port}")
    int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void showUserByIdTest() {
        // given
        String targetUrl = "http://localhost:" + port + "/users/find?email=adammalysz@gmail.com";

        // when
        ResponseEntity<UserDTO> response = restTemplate.getForEntity(targetUrl, UserDTO.class);

        // then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Adam", response.getBody().getFirstname());
        assertEquals("Malysz", response.getBody().getLastname());
        assertEquals("adammalysz@gmail.com", response.getBody().getEmail());
    }


    @Test
    public void showUserByIdTest2() {
        // given
        String targetUrl = "http://localhost:" + port + "/users/find?email=gsfdsgfdg@gmail.com";

        // when
        ResponseEntity<UserDTO> response = restTemplate.getForEntity(targetUrl, UserDTO.class);

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }


}