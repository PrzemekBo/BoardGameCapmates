package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDAOImpl implements UserDAO {

    private List<User> listOfUser;


    @Override
    public User findByEmail(String email) {
        Optional<User> users = listOfUser.stream()
                .filter(user -> user.getEmail() == email)
                .findAny();
        return users.get();
    }

    @Override
    public User findById(int id) {

        Optional<User> users = listOfUser.stream()
                .filter(user -> user.getId() == id)
                .findAny();
        return users.get();

    }

    @Override
    public User update(User user) {
        User userToUpdate = findByEmail(user.getEmail());
        listOfUser.remove(userToUpdate);
        listOfUser.add(user);

        return user;
    }

    @Override
    public User createUser(User newUser) {
        this.listOfUser.add(newUser);
        return newUser;
    }




    /*  @Override
      public void updateUser(User user) {
          User savedUser = findById(user.getId());
          savedUser.setFirstname(user.getFirstname());
          savedUser.setLastname(user.getLastname());
          savedUser.setEmail(user.getEmail());
          savedUser.setPassword(user.getPassword());

      }
  */
    @Override
    public void addGameToUserGameList(String email, Game game) {
        User user = findByEmail(email);
        user.getUserUserGameList().add(game);

        //TODO poprawic


    }

    @Override
    public List<Game> getUserUserGameList(String email) {
        User user = findByEmail(email);
        return user.getUserUserGameList();
    }






    public UserDAOImpl() {
        listOfUser = new ArrayList<>();


        User user1 = new User(1, "Adam", "Malysz", "adammalysz@gmail.com", "43424324", "fer rewrsad");
        User user2 = new User(2, "Tome", "Doms", "tomek@gmail.com", "43424324", "fer rewrsad");
        User user3 = new User(3, "Ada", "MM", "ada@gmail.com", "542342", "fer rewrsad");
        listOfUser.add(user1);
        listOfUser.add(user2);
        listOfUser.add(user3);

    }


}

