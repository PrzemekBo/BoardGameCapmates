package com.boardgame.comdemo;


import com.boardgame.comdemo.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComDemoApplication.class, args);
    }


    User.UserBuilder userBuilder= new User.UserBuilder("sfdsfs","dsdff","fdsfsd","fefdsf","fdsfdsf");


/*
    BasicBuldierUser buldierUser= new BasicBuldierUser();


    User user1= new User("Adam","malzsy","dewdew@fdsfds","4324234","sefesf sfsdfds");
    User user2= new User("fef","dasdsa","fdsf","fsfs","fsfds");
*/













}
