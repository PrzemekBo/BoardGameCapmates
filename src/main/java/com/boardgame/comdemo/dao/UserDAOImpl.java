package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserDAO {

    private List<User> listOfUser;

    public UserDAOImpl(){
        this.listOfUser= new ArrayList<>();
    }
    @Override
    public User findByEmail(String email) {
        Optional<User> users = listOfUser.stream()
                .filter(user -> user.getEmail() == email)
                .findAny();
        return users.get();
    }

    @Override
    public User findById(int id) {

       Optional<User>users=listOfUser.stream()
               .filter(user -> user.getId()==id)
               .findAny();
       return users.get();

    }

    @Override
    public void updateUser(User user) {
        User savedUser= findById(user.getId());
        savedUser.setFirstname(user.getFirstname());
        savedUser.setLastname(user.getLastname());
        savedUser.setEmail(user.getEmail());
        savedUser.setPassword(user.getPassword());

    }


}

