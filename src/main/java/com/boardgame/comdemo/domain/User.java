package com.boardgame.comdemo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
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




    private User(UserBuilder builder){
        this.firstname=builder.firstname;
        this.lastname=builder.lastname;
        this.email=builder.email;
        this.motto=builder.motto;
        this.password=builder.password;
        this.hoursAvailability=builder.hoursAvailability;
        this.gameCollection=builder.gameCollection;
        this.gameHistory=builder.gameHistory;
        this.rankingPosition=builder.rankingPosition;
        this.userLevel=builder.userLevel;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMotto() {
        return motto;
    }

    public HoursAvailability getHoursAvailability() {
        return hoursAvailability;
    }

    public List getGameCollection() {
        return gameCollection;
    }

    public List getGameHistory() {
        return gameHistory;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }





    public static class UserBuilder{

        private final String firstname;
        private final String lastname;
        private final String email;
        private final String password;
        private final String motto;

        private HoursAvailability hoursAvailability;

        private List gameCollection;
        private List gameHistory;

        private int rankingPosition;
        private UserLevel userLevel;




        public UserBuilder(String firstname, String lastname, String email, String password, String motto) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.password = password;
            this.motto = motto;
        }


        public UserBuilder hoursAvailability(HoursAvailability hoursAvailability){
            this.hoursAvailability=hoursAvailability;
            return this;
        }

        public UserBuilder gameCollection(List gameCollection){
            this.gameCollection=gameCollection;
            return this;
        }

        public UserBuilder gameHistory(List gameHistory){
            this.gameHistory=gameHistory;
            return this;
        }

        public UserBuilder rankingPosition(int rankingPosition){
            this.rankingPosition=rankingPosition;
            return this;
        }
        public UserBuilder userLevel(UserLevel userLevel){
            this.userLevel=userLevel;
            return this;
        }

    }







}
