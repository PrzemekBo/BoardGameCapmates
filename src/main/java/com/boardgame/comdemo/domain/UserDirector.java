package com.boardgame.comdemo.domain;

public class UserDirector {

    private  UserBuilder userBuilder;

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
