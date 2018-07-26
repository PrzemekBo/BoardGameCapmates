package com.boardgame.comdemo.dto;

import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.enums.MatchResult;

public class MatchDTO {

    private User userOne;
    private User userTwo;

    public MatchDTO(User userOne, User userTwo) {
        this.userOne = userOne;
        this.userTwo = userTwo;
    }

    public MatchDTO() {

    }

    public User getUserOne() {
        return userOne;
    }

    public void setUserOne(User userOne) {
        this.userOne = userOne;
    }

    public User getUserTwo() {
        return userTwo;
    }

    public void setUserTwo(User userTwo) {
        this.userTwo = userTwo;
    }
}
