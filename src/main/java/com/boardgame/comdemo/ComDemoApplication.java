package com.boardgame.comdemo;

import com.boardgame.comdemo.domain.BasicBuldierUser;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.domain.UserDirector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComDemoApplication.class, args);
    }


    BasicBuldierUser buldierUser= new BasicBuldierUser();


    User user1= new User("Adam","malzsy","dewdew@fdsfds","4324234","sefesf sfsdfds");
    User user2= new User("fef","dasdsa","fdsf","fsfs","fsfds");













}
