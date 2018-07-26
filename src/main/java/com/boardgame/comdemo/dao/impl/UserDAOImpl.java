package com.boardgame.comdemo.dao.impl;

import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.Availibility;
import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.GamesHistory;
import com.boardgame.comdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;


@Repository
public class UserDAOImpl implements UserDAO {


    private final static String TIME_NOT_FOUND = "Zero player on this time";
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

    @Override
    public void delete(String email) {
        listOfUser.remove(findByEmail(email));


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
    public void addGameToCollection(String email, Game game) {
      //  User user = findByEmail(email);
       // user.getUserUserGameList().add(game);

        User user = findByEmail(email);
        Set<Game> gamesCollection = user.getGamesCollection();
        if(gamesCollection == null) {
            gamesCollection = new HashSet<>();
        }
        gamesCollection.add(game);
        user.setGamesCollection(gamesCollection);
    }



    @Override
    public Set<Game> getGameCollection(String email) {
        User user=findByEmail(email);
        return user.getGamesCollection();
    }

    @Override
    public void addAvailibilityTimeToList(String email, Availibility availibility) {
        User user = findByEmail(email);
        List<Availibility> availibilityList = user.getAvailibility();
        if(availibilityList == null) {
            availibilityList = new ArrayList<>();
        }
        availibilityList.add(availibility);
        user.setAvailibility(availibilityList);

    }

    @Override
    public List<Availibility> getAvailibilityTimeList(String email) {

        User user = findByEmail(email);
        return user.getAvailibility();
    }


    @Override
    public List<Availibility> updateAvailibilityTime(String email, Availibility availibility) {
        User user = findByEmail(email);

        List<Availibility> availibilityList = user.getAvailibility();
        Availibility timeToUpdate = getAvailibilityTimeById(email, availibility.getId());

        availibilityList.remove(timeToUpdate);
        availibilityList.add(availibility);

        return availibilityList;
    }

    @Override
    public Availibility getAvailibilityTimeById(String email, Long iD) {
        List<Availibility> availibilityList = getAvailibilityTimeList(email);

        return availibilityList.stream().filter(a -> iD.equals(a.getId())).findAny()
                .orElseThrow(() -> new RuntimeException(TIME_NOT_FOUND));

    }

    @Override
    public void removeGameFromCollection(String email, Game game) {
        User user = findByEmail(email);
        Set<Game> gamesCollection = user.getGamesCollection();
        gamesCollection.remove(game);
        user.setGamesCollection(gamesCollection);


    }


    @Override
    public void addRegistryToGameHistory(String email, GamesHistory gameHistory) {
        User user = findByEmail(email);
     //   user.getGamesCollection().add(gameHistory);

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

