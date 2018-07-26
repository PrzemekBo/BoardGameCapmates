package com.boardgame.comdemo;

import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {


    public UserDTO map(User user){
        UserDTO userDTO= new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getFirstname());
        userDTO.setLastname(user.getLastname());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setMotto(user.getMotto());
        userDTO.setHoursAvailability(user.getHoursAvailability());
        userDTO.setGameHistory(user.getGameHistory());
        userDTO.setRankingPosition(user.getRankingPosition());
        userDTO.setUserLevel(user.getUserLevel());
        return userDTO;
    }


    public static User map(UserDTO userDTO) {

        User user = new User();
        user.setId(userDTO.getId());
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setEmail(userDTO.getEmail());
        user.setMotto(userDTO.getMotto());
        user.setHoursAvailability(userDTO.getHoursAvailability());
        user.setGameHistory(userDTO.getGameHistory());
        user.setRankingPosition(userDTO.getRankingPosition());
        user.setUserLevel(userDTO.getUserLevel());

        return user;

    }

}
