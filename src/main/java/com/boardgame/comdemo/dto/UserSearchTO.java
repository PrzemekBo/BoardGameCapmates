package com.boardgame.comdemo.dto;

public class UserSearchTO {

    private String eMail;
    private String firstName;
    private String lastName;
    private String gameName;


    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public UserSearchTO(String eMail, String firstName, String lastName, String gameName) {
        this.eMail = eMail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gameName = gameName;
    }
}
