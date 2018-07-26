package com.boardgame.comdemo.dao.impl;

import com.boardgame.comdemo.dao.GameDAO;
import com.boardgame.comdemo.domain.Game;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class GameDAOImpl implements GameDAO {




    private List<Game> collectionOfAllgames;

    public GameDAOImpl() {
        collectionOfAllgames = new ArrayList<>();
        this.collectionOfAllgames.add(new Game(1,"Warcaby"));
        this.collectionOfAllgames.add(new Game(2,"Bierki"));
        this.collectionOfAllgames.add(new Game(3,"Szachy"));


    }

    @Override
    public void add(Game game) {
        Game addedGame=game;
        collectionOfAllgames.add(addedGame);
    }

    @Override
    public void update(Game game) {

    }

    @Override
    public Game findByName(String name) {
        return null;
    }

    @Override
    public void delete(String name) {

    }

}
