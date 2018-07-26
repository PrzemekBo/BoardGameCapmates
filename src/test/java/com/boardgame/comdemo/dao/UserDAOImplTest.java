package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.UserMapper;
import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.service.UserProfilService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.w3c.dom.UserDataHandler;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOImplTest {

    UserProfilService userProfilService;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    UserDAO userDAO;

    private List<User> listOfUser;

    public void users() {


        User user1 = new User(1, "Adam", "Malysz", "adammalysz@gmail.com", "43424324", "fer rewrsad");
        User user2 = new User(2, "Tome", "Doms", "tomek@gmail.com", "43424324", "fer rewrsad");
        User user3 = new User(3, "Ada", "MM", "ada@gmail.com", "542342", "fer rewrsad");
        listOfUser.add(user1);
        listOfUser.add(user2);
        listOfUser.add(user3);

    }

    @Test
    public void shouldFindByEmail() {
        //When
        int userId = userDAO.findByEmail("ada@gmail.com").getId();

        //Then
        Assert.assertEquals(3, userId);
    }


    @Test
    public void shouldFindById() {


        //When
        String userFirstName = userDAO.findById(1).getFirstname();

        //Then
        Assert.assertEquals("Adam", userFirstName);
    }


    @Test
    public void shouldUpdate() {


        //given
        User user1 = new User(1, "Marysia", "Malysz", "adammalysz@gmail.com", "newPassword", "fer rewrsad");

        //when
        userDAO.update(user1);

        //then

        assertEquals("newPassword",userDAO.findByEmail("adammalysz@gmail.com").getPassword());
       // assertNull(userDAO.findByEmail("adammalysz@gmail.com").getLastname());



    }

    @Test
    public void createUser() {

        //given
        User user1 = new User(1, "Marysia", "Madlysz", "adammalysz2@gmail.com", "newPasswor4d", "fer 43rrewrsad");

        //when
        userDAO.createUser(user1);

        //then
        assertEquals("Marysia", userDAO.findByEmail("adammalysz2@gmail.com").getFirstname());
    }

    @Test
    public void addGameToUserGameList() {

        Game game = new Game(1,"Warcaby");

        userDAO.addGameToUserGameList("adammalysz@gmail.com", game);

        int sizeOfCollection = userDAO.getUserUserGameList("adammalysz@gmail.com").size();
        assertEquals(1, sizeOfCollection);
    }

    @Test
    public void getUserUserGameList() {
    }
}