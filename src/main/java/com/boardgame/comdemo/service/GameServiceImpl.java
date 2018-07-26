package com.boardgame.comdemo.service;

import com.boardgame.comdemo.GameMapper;
import com.boardgame.comdemo.UserMapper;
import com.boardgame.comdemo.dao.GameDAO;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.dto.GameDTO;
import com.boardgame.comdemo.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class GameServiceImpl implements GameService {


    UserMapper userMapper;

    GameMapper gameMapper;

    GameDAO gameDAO;

    UserDAO userDAO;


    @Override
    public Set<GameDTO> getGamesCollection(UserDTO userDTO) {
/*        User userEntity = userMapper.map(userDTO);
        Set<Game> gamesCollection = userDAO.get(userEntity.getEMail());
        return gameMapper.map2TO(gamesCollection);*/
return null;
    }

    @Override
    public void removeGameFromCollection(UserDTO userTO, GameDTO gameTO) {

    }

    @Override
    public GameDTO addGameToGeneralCollection(UserDTO userDTO, GameDTO gameTO) {
        return null;
    }

    @Override
    public Set<GameDTO> addGameToUserCollection(UserDTO userDTO, GameDTO gameDTO) {
        return null;
    }
}
