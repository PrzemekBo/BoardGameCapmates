package com.boardgame.comdemo.service.impl;

import com.boardgame.comdemo.mapper.GameMapper;
import com.boardgame.comdemo.mapper.UserMapper;
import com.boardgame.comdemo.dao.GameDAO;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.GameDTO;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class GameServiceImpl implements GameService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    GameMapper gameMapper;
    @Autowired
    GameDAO gameDAO;
    @Autowired
    UserDAO userDAO;


    @Override
    public Set<GameDTO> getGamesCollection(UserDTO userDTO) {
        User user = userMapper.map(userDTO);
        Set<Game> gamesCollection = userDAO.getGameCollection(user.getEmail());
        return gameMapper.map2TO(gamesCollection);
    }

    @Override
    public void removeGameFromCollection(UserDTO userDTO, GameDTO gameDTO) {
        User user = userMapper.map(userDTO);
        Game game = gameMapper.map(gameDTO);

        userDAO.removeGameFromCollection(user.getEmail(), game);
    }

    @Override
    public Set<GameDTO> addGameToGeneralCollection(UserDTO userDTO, GameDTO gameDTO) {
        User user = userMapper.map(userDTO);
        Game game = gameMapper.map(gameDTO);

        gameDAO.add(game);
        userDAO.addGameToCollection(user.getEmail(), game);

        return gameMapper.map2TO(userDAO.getGameCollection(user.getEmail()));
    }

    @Override
    public Set<GameDTO> addGameToUserCollection(UserDTO userDTO, GameDTO gameDTO) {
        User user = userMapper.map(userDTO);
        Game game = gameMapper.map(gameDTO);

        game = gameDAO.findByName(game.getGameName());
        userDAO.addGameToCollection(user.getEmail(), game);
        Set<Game> gamesCollection = userDAO.getGameCollection(user.getEmail());

        return gameMapper.map2TO(gamesCollection);
    }

}
