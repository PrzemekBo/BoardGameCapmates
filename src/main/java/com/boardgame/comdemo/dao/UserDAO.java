package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.User;

import java.util.ArrayList;
import java.util.List;

public interface UserDAO {

    User findByEmail(String email);
    User findById(int id);
    void updateUser(User user);





}
