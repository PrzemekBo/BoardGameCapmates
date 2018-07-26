package com.boardgame.comdemo.dao;

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
    public Set<Game> getUserAllGames(String email) {
    /*    List<Game> userGames = new ArrayList<>();

        for (Game game : gamesCollection) {
            Optional<Long> optionalId = game.getC().stream().filter(id -> id == userId).findAny();

            if (optionalId.isPresent()){
                userGames.add(game);
            }
        }*/
        return null;

    }

    @Override
    public Game findGameByName(String gameName){
        for (int i = 0; i < collectionOfAllgames.size(); i++) {
            if (collectionOfAllgames.get(i).getGameName().equals(gameName)) {
                return collectionOfAllgames.get(i);
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public void addNewGame(Game game) {
        Game addedGame=game;
        collectionOfAllgames.add(addedGame);


    }

    @Override
    public void addNewGame(int id, String gameName) {
        Game addedGame=null;
        addedGame.setId(id);
        addedGame.setGameName(gameName);
        collectionOfAllgames.add(addedGame);

    }


    @Override
    public boolean removeGame(Game game) {

        if (isGameAlreadyInGameCollection(game.getGameName())){
            return false;
        }

        collectionOfAllgames.remove(game);
        return true;

    }

    @Override
    public void addGameToGlobalList(Game game) {

    }

    private boolean isGameAlreadyInGameCollection(String gameName) {

        Iterator<Game> iterator  = collectionOfAllgames.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getGameName() == gameName) {
                return true;
            }
        }
        return false;
    }


}
