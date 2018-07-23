package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.User;

public interface UserDAO {

    User findByEmail(String email);

}
