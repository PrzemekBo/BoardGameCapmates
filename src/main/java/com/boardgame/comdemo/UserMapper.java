package com.boardgame.comdemo;

import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;

public class UserMapper {


    public UserDTO constructUserDTO(User user){
        UserDTO userDTO= new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getFirstname());
        userDTO.setLastname(user.getLastname());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setHoursAvailability(user.getHoursAvailability());
        userDTO.setGameCollection(user.getGameCollection());
        userDTO.setGameHistory(user.getGameHistory());
        userDTO.setRankingPosition(user.getRankingPosition());
        userDTO.setUserLevel(user.getUserLevel());
        return userDTO;
    }
}
