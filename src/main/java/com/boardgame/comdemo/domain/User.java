package com.boardgame.comdemo.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;


@Getter
@Setter
public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String motto;


    private List<Availibility> Availibility;
    private Set<Game> gamesCollection;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private List<GamesHistory> gameHistory;


    private int rankingPosition;


    public User() {

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

    public List<com.boardgame.comdemo.domain.Availibility> getAvailibility() {
        return Availibility;
    }

    public void setAvailibility(List<com.boardgame.comdemo.domain.Availibility> availibility) {
        Availibility = availibility;
    }

    public Set<Game> getGamesCollection() {
        return gamesCollection;
    }

    public void setGamesCollection(Set<Game> gamesCollection) {
        this.gamesCollection = gamesCollection;
    }

    public List<GamesHistory> getGameHistory() {
        return gameHistory;
    }

    public void setGameHistory(List<GamesHistory> gameHistory) {
        this.gameHistory = gameHistory;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }


    public User(int id, String firstname, String lastname, String email, String password, String motto) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.motto = motto;
    }
}
