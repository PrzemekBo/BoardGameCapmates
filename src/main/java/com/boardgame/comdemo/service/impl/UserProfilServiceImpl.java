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

    private UserDAO userDAO;
    private UserMapper userMapper;


    List<User> usersList = new ArrayList<>();


    @Autowired
    public UserProfilServiceImpl(UserDAO userDAO, UserMapper userMapper) {
        this.userDAO = userDAO;
        this.userMapper = userMapper;
    }


    @Override
    public UserDTO createUserProfile(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO getProfileInformation(String eMail) {
        return userMapper.map(userDAO.getUserByEMail(eMail));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public List<UserDTO> findUserByMultipleParam(UserSearchTO user) {
        return null;
    }

    @Override
    public UserDTO update(UserDTO user) {
        return null;
    }

    @Override
    public void deleteUser(String eMail) {
        usersList.remove(userDAO.getUserByEMail(eMail));
    }

    }
}
