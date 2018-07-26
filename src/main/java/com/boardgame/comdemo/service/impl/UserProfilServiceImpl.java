package com.boardgame.comdemo.service.impl;

import com.boardgame.comdemo.mapper.UserMapper;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.service.UserProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserProfilServiceImpl implements UserProfilService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    UserMapper userMapper;


    @Override
    public UserDTO createUserProfile(UserDTO user) {
        User entity = userMapper.map(user);
        entity = userDAO.createUser(entity);
        return userMapper.map(entity);
    }

    @Override
    public UserDTO getProfileInformation(String email) {
        return userMapper.map(userDAO.findByEmail(email));
    }

    @Override
    public UserDTO update(UserDTO user) {
        User entity = userMapper.map(user);
        entity = userDAO.update(entity);
        return userMapper.map(entity);
    }


}
