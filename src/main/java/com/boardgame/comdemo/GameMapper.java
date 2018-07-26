package com.boardgame.comdemo;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.GameDTO;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {
    public GameDTO map(Game game) {
        GameDTO gameDTO = new GameDTO();
        gameDTO.setId(game.getId());
        gameDTO.setGameName(game.getGameName());
        return gameDTO;


    }

    public Game map(GameDTO gameDTO) {
        Game game = new Game();
        game.setId(gameDTO.getId());
        game.setGameName(gameDTO.getGameName());
        return game;


    }
}
