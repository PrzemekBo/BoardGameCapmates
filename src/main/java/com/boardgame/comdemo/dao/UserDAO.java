package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.User;

import java.util.List;
import java.util.Set;


public interface UserDAO {

    User findByEmail(String email);

    User findById(int id);

    User update(User user);

    User createUser(User newUser);
  //  Set<GameDAO> getGameCollection(String email);

  //  void addGameToCollection(String email, Game game);

    void addGameToUserGameList (String email, Game game);

    List<Game> getUserUserGameList(String email);


}
