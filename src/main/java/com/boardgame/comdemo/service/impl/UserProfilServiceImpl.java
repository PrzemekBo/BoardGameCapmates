package com.boardgame.comdemo.service.impl;

import com.boardgame.comdemo.dao.error.UserNotFoundException;
import com.boardgame.comdemo.dto.UserSearchTO;
import com.boardgame.comdemo.mapper.UserMapper;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.service.UserProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserProfilServiceImpl implements UserProfilService {


    @Autowired
    UserDAO userDAO;

    @Autowired
    UserMapper userMapper;




    @Autowired
    public UserProfilServiceImpl(UserDAO userDAO, UserMapper userMapper) {
        this.userDAO = userDAO;
        this.userMapper = userMapper;
    }


    @Override
    public UserDTO createUserProfile(UserDTO user) {
        User entity = userMapper.map(user);
        entity = userDAO.createUser(entity);
        return userMapper.map(entity);
    }

    @Override
    public UserDTO getProfileInformation(String eMail) {
        return userMapper.map(userDAO.getUserByEMail(eMail));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userMapper.map2TO(userDAO.getAllUsers());
    }
    @Override
    public List<UserDTO> findUserByMultipleParam(UserSearchTO user) {

        String eMail = user.geteMail();
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        //String gameName = user.getGameName();

        List<User> resultList = new ArrayList<>();

        if (eMail.length() > 0) {
            try {
                User foundPlayer = userDAO.getUserByEMail(eMail);
                resultList.add(foundPlayer);
            } catch (UserNotFoundException ex) {
            }
        }

        if (firstName.length() > 0) {
            List<User> foundPlayers = userDAO.getUsersByFirstName(firstName);
            if (resultList.isEmpty()) {
                resultList.addAll(foundPlayers);
            } else {
                resultList.retainAll(foundPlayers);
            }
        }

        if (lastName.length() > 0) {
            List<User> foundPlayers = userDAO.getUsersByLastName(lastName);
            if (resultList.isEmpty()) {
                resultList.addAll(foundPlayers);
            } else {
                resultList.retainAll(foundPlayers);
            }
        }
/*
        if (gameName.length() > 0) {
            List<User> foundPlayers = userDAO.getUsersByGameType(gameName);
            if (resultList.isEmpty()) {
                resultList.addAll(foundPlayers);
            } else {
                resultList.retainAll(foundPlayers);
            }
        }*/

        return userMapper.map2TO(resultList);
    }

    @Override
    public UserDTO update(UserDTO user) {
        User entity = userMapper.map(user);
        entity = userDAO.update(entity);
        return userMapper.map(entity);
    }
    @Override
    public void deleteUser(String eMail) {
        userDAO.delete(eMail);
    }


}
