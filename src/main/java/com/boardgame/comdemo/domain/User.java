package com.boardgame.comdemo.domain;

import com.boardgame.comdemo.dao.GameDAO;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.enums.UserLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String motto;
    private HoursAvailability hoursAvailability;


    private List<HoursAvailability>hoursAvailabilities;
    private List gameCollection;
    private List gameHistory;

    private int rankingPosition;
    private UserLevel userLevel;

    public List<HoursAvailability> getHoursAvailabilities() {
        return hoursAvailabilities;
    }

    public void setHoursAvailabilities(List<HoursAvailability> hoursAvailabilities) {
        this.hoursAvailabilities = hoursAvailabilities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public HoursAvailability getHoursAvailability() {
        return hoursAvailability;
    }

    public void setHoursAvailability(HoursAvailability hoursAvailability) {
        this.hoursAvailability = hoursAvailability;
    }

    public List<GameDAO> getGameCollection() {
        return gameCollection;
    }

    public void setGameCollection(List gameCollection) {
        this.gameCollection = gameCollection;
    }

    public List getGameHistory() {
        return gameHistory;
    }

    public void setGameHistory(List gameHistory) {
        this.gameHistory = gameHistory;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(UserLevel userLevel) {
        this.userLevel = userLevel;
    }

    public User(int id, String firstname, String lastname, String email, String password, String motto) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.motto = motto;
    }

    public User() {
    }

    public List<Game> getUserUserGameList() {
        return gameCollection;
    }

    public static class UserBuilder extends UserDTO {

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
