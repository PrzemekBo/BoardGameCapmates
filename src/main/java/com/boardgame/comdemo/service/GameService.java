package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dto.GameDTO;
import com.boardgame.comdemo.dto.UserDTO;

import java.util.Set;

public interface GameService {


    Set<GameDTO> getGamesCollection(UserDTO user);

    void removeGameFromCollection(UserDTO userDTO, GameDTO gameDTO);

    Set<GameDTO> addGameToGeneralCollection(UserDTO userDTO, GameDTO gameDTO);

    Set<GameDTO> addGameToUserCollection(UserDTO userDTO, GameDTO gameDTO);

}
