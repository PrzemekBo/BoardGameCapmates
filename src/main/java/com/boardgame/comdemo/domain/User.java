package com.boardgame.comdemo.domain;

import lombok.Data;

@Data
public class User {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String motto;
    private HoursAvailability hoursAvailability;

}
