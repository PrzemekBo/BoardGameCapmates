package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private List<User> listOfUser;

    public UserDAOImpl(){
        this.listOfUser= new ArrayList<>();
    }
    @Override
    public User findByEmail(String email) {
        return  ;
    }
}
