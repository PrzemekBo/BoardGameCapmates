package com.boardgame.comdemo.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String motto;
    private HoursAvailability hoursAvailability;

    private List gameCollection;
    private List gameHistory;

    private int rankingPosition;
    private UserLevel userLevel;

    public User(String firstname, String lastname, String email, String password, String motto) {
    }


}
