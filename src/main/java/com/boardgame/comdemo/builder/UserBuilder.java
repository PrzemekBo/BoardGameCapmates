package com.boardgame.comdemo.builder;

import com.boardgame.comdemo.domain.HoursAvailability;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.domain.UserLevel;

import java.util.List;

public interface UserBuilder {

    void buildFirstname();
    void buildLastname();
    void buildEmail();
    void buildPassword();
    void biuldMotto();


    User getUser();




}
