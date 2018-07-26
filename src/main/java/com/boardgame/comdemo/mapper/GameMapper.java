package com.boardgame.comdemo.mapper;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.GameDTO;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;


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

    public Set<GameDTO> map2TO(Set<Game> gameEnities) {
        return gameEnities.stream().map(this::map).collect(Collectors.toSet());
    }
}
