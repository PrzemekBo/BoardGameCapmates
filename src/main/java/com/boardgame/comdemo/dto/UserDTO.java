package com.boardgame.comdemo.dto;

import com.boardgame.comdemo.domain.HoursAvailability;
import com.boardgame.comdemo.enums.UserLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private int id;
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

    public List getGameCollection() {
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
}
