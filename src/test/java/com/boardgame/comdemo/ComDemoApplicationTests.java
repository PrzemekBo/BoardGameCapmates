package com.boardgame.comdemo;

import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComDemoApplicationTests {

    @Test
    public void shouldFindById() {



        User.UserBuilder user1= new User.UserBuilder("Adam","Malzsy","adam@gmail.com)","dfdyfd","fsfdsfdsf");
        User.UserBuilder user2= new User.UserBuilder("Adam","Malzsy","dfsadsa@gmail.com)","dfdyfd","fsfdsfdsf");
        User.UserBuilder user3= new User.UserBuilder("Adam","Malzsy","adadsadsadm@gmail.com)","dfdyfd","fsfdsfdsf");

        List<User.UserBuilder> streamOfArray = new ArrayList<>();
        streamOfArray.add(user1);
        streamOfArray.add(user2);
        streamOfArray.add(user3);

        streamOfArray.co

    }

}
