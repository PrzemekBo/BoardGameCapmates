package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dto.GameDTO;
import com.boardgame.comdemo.dto.UserDTO;

import java.util.Set;

public interface GameService {

    Set<GameDTO> getGamesCollection(UserDTO userDTO);

    void removeGameFromCollection(UserDTO userTO, GameDTO gameTO);

    GameDTO addGameToGeneralCollection(UserDTO userDTO, GameDTO gameTO);

    Set<GameDTO> addGameToUserCollection(UserDTO userDTO, GameDTO gameDTO);

}
