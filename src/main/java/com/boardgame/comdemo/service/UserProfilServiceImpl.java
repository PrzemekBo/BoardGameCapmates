package com.boardgame.comdemo.service;

import com.boardgame.comdemo.UserMapper;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;


public class UserProfilServiceImpl implements UserProfilService {


    private UserMapper userMapper;

    @Autowired
    private UserDAO userDAO;

    public UserProfilServiceImpl() {
    }



    @Override
    public UserDTO showUserProfileInformation(int id) {
        return userMapper.constructUserDTO(userDAO.findById(id));

    }

    @Override
    public void changeAndSaveNewFirstName(UserDTO userDTO) {
        User user=userDAO.findByEmail(userDTO.getEmail());
        user.setFirstname(user.getFirstname());



    }

    @Override
    public void changeAndSaveNewLastName(UserDTO userDTO) {
        User user=userDAO.findByEmail(userDTO.getEmail());
        user.setLastname(user.getLastname());

    }

    @Override
    public void changeAndSaveNewEmail(UserDTO userDTO) {
        User user=userDAO.findByEmail(userDTO.getEmail());
        user.setEmail(user.getEmail());

    }

    @Override
    public void changeAndSaveNewPassword(UserDTO userDTO) {
        User user=userDAO.findByEmail(userDTO.getEmail());
        user.setPassword(user.getPassword());


    }

    @Override
    public void changeAndSaveNewMotto(UserDTO userDTO) {
        User user=userDAO.findByEmail(userDTO.getEmail());
        user.setMotto(user.getMotto());

    }
}
