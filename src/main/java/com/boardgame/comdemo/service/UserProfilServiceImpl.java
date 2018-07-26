package com.boardgame.comdemo.service;

import com.boardgame.comdemo.UserMapper;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfilServiceImpl implements UserProfilService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO showUserProfileInformation(String email) {
            return userMapper.map(userDAO.findByEmail(email));

    }

    @Override
    public UserDTO update(UserDTO user) {
        User entity = userMapper.map(user);
        entity = userDAO.update(entity);
        return userMapper.map(entity);
    }

    @Override
    public UserDTO createUserProfile(UserDTO user) {
        User entity = userMapper.map(user);
        entity = userDAO.createUser(entity);
        return userMapper.map(entity);
    }

    @Override
    public void changeAndSaveNewFirstName(int id, String firstname) {
        User user = userDAO.findById(id);
        user.setFirstname(firstname);
    }

    @Override
    public void changeAndSaveNewLastName(int id, String lastname) {
        User user = userDAO.findById(id);
        user.setLastname(lastname);
    }

    @Override
    public void changeAndSaveNewEmail(int id, String email) {
        User user = userDAO.findById(id);
        user.setEmail(email);

    }

    @Override
    public void changeAndSaveNewPassword(int id, String password) {
        User user = userDAO.findById(id);
        user.setPassword(password);
    }

    @Override
    public void changeAndSaveNewMotto(int id, String motto) {
        User user = userDAO.findById(id);
        user.setMotto(motto);

    }




  /*  @Override
    public UserDTO showUserProfileInformation(String email) {
        return userMapper.map(userDAO.findByEmail(email));

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

    private void saveChanges(UserDTO userDTO){
        User user = userMapper.map(userDTO);
        userDAO.updateUser(user);
    }*/
}
