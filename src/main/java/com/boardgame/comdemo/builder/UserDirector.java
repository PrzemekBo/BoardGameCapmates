package com.boardgame.comdemo.builder;

import com.boardgame.comdemo.builder.UserBuilder;
import com.boardgame.comdemo.domain.User;

public class UserDirector {

    private UserBuilder userBuilder;

    public UserDirector(UserBuilder userBuilder){
        this.userBuilder=userBuilder;
    }

    public void buildUser(){
        userBuilder.buildFirstname();
        userBuilder.buildLastname();
        userBuilder.buildEmail();
        userBuilder.buildPassword();
        userBuilder.biuldMotto();
    }

    public User getUser(){
        return this.userBuilder.getUser();
    }
}
