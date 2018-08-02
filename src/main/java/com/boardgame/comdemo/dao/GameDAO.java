package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Game;

import java.util.List;
import java.util.Set;

public interface GameDAO {


    void add(Game game);

    void update(Game game);

    Game findByName(String name);

    void delete(String name);


}
