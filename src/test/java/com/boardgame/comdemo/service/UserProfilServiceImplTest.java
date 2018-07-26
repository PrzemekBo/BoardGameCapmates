package com.boardgame.comdemo.service;

import com.boardgame.comdemo.UserMapper;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.dao.UserDAOImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserProfilServiceImplTest {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDAOImpl userDaoImpl;

    UserProfilService userProfilService;


    @Test
    public void shouldshowUserProfileInformation() {
    }

    @Test
    public void shouldUpdate() {


      //  int user = userProfilService.update(user).getId();

    }
}