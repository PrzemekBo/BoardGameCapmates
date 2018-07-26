package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Game;

import java.util.List;
import java.util.Set;

public interface GameDAO {

/*
    Set<Game> getUserAllGames(String email);

    Game findGameByName(String gameName);

    //TODo wywalilem do usera
   // boolean addGame(Game game);

    void addNewGame(Game game);

    void addNewGame(int id,String gameName);

    boolean removeGame(Game game);

    void addGameToGlobalList(Game game);
*/
    void add(Game game);

    void update(Game game);

    Game findByName(String name);

    void delete(String name);


}
