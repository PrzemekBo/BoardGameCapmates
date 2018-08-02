package com.boardgame.comdemo.dto;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.GamesHistory;
import lombok.Builder;

import java.util.List;
import java.util.Set;


public class UserDTO {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String motto;


    private List<com.boardgame.comdemo.domain.Availibility> Availibility;
    private Set<Game> gamesCollection;
    private List<GamesHistory> gameHistory;

    public UserDTO() {

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

    public UserDTO(int id, String firstname, String lastname, String email, String password, String motto) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.motto = motto;
    }
}

