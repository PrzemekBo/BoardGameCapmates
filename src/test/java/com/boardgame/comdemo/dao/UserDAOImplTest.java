package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.UserMapper;
import com.boardgame.comdemo.service.UserProfilService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOImplTest {

    UserProfilService userProfilService;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    UserDAOImpl userDAOImpl;



    @Test
    public void shouldFindByEmail() {
        //When
        int userId = userDAOImpl.findByEmail("ada@gmail.com").getId();

        //Then
        Assert.assertEquals(3, userId);
    }


    @Test
    public void shouldFindById() {


        //When
        String userFirstName = userDAOImpl.findById(1).getFirstname();

        //Then
        Assert.assertEquals("Adam", userFirstName);
    }


    @Test
    public void shouldUpdate() {

    }

    @Test
    public void createUser() {
    }

    @Test
    public void addGameToUserGameList() {
    }

    @Test
    public void getUserUserGameList() {
    }
}