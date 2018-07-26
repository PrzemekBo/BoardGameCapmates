package com.boardgame.comdemo.domain;

import com.boardgame.comdemo.enums.MatchResult;

public class Match {

   private User userOne;
   private User userTwo;

    public Match(User userOne, User userTwo) {
        this.userOne = userOne;
        this.userTwo = userTwo;
    }

    public Match() {

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
