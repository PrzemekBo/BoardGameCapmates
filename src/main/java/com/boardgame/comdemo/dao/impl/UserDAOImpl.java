package com.boardgame.comdemo.dao.impl;

import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.dao.error.UserNotFoundException;
import com.boardgame.comdemo.domain.Availibility;
import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.GamesHistory;
import com.boardgame.comdemo.domain.User;
import com.google.common.base.Preconditions;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;


@Repository
public class UserDAOImpl implements UserDAO {


    private final static String EMAIL_IS_NULL = "Email is empty";

    private final static String USER_NOT_FOUND = "User not found";

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
    public User findByFirstName(String firstname) {
        Optional<User> users = listOfUser.stream()
                .filter(user -> user.getFirstname() == firstname)
                .findAny();
        return users.get();
    }

    @Override
    public User update(User user) {
        User userToUpdate = getUserByEMail(user.getEmail());
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
        listOfUser.remove(getUserByEMail(email));


    }

    @Override
    public List<User> getAllUsers() {

            return this.listOfUser;

    }

    @Override
    public List<User> getUsersByLastName(String lastName) {
        return listOfUser.stream()
                .filter(l -> lastName.equalsIgnoreCase(l.getLastname()))
                .collect(Collectors.toList());
    }
    @Override
    public List<User> getUsersByGameType(String gameName) {
        return listOfUser.stream()
                .filter(u -> u.getGamesCollection().stream()
                        .anyMatch(g -> g.getGameName().equalsIgnoreCase(gameName)))
                .collect(Collectors.toList());
    }

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

    @Override
    public List<User> findUserByFirstNameAndLastNameAndEmailAdres(String firstname, String lastname, String email) {
        List<User> lookingForUser = new ArrayList<>();
        for (User user : listOfUser) {
            if ((user.getFirstname().equals(firstname)) &&
                    (user.getLastname().equals(lastname)) &&
                    (email.equals(user.getEmail()))) {
                lookingForUser.add(user);
            }
        }
        return lookingForUser;
    }

   @Override
    public List<User> getUsersByFirstName(String firstName) {
        return listOfUser.stream()
                .filter(f -> firstName.equalsIgnoreCase(f.getFirstname()))
                .collect(Collectors.toList());
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

    @Override
    public User getUserByEMail(String eMail) {
        Preconditions.checkNotNull(eMail, EMAIL_IS_NULL);



        return listOfUser.stream().filter(e -> eMail.equals(e.getEmail())).findAny()
                .orElseThrow(() -> new UserNotFoundException(USER_NOT_FOUND));
    }





}

