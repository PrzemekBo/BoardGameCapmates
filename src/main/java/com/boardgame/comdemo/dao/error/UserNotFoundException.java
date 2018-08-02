package com.boardgame.comdemo.dao.error;

public class UserNotFoundException extends RuntimeException {



    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException() {

    }
}
