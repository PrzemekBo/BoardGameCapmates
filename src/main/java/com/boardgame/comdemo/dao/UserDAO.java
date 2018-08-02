package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Availibility;
import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.GamesHistory;
import com.boardgame.comdemo.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface UserDAO {

    User findByEmail(String email);

    User findById(int id);

    User findByFirstName(String firstname);

    User update(User user);

    User createUser(User newUser);

    void delete(String email);

    List<User> getAllUsers();

    List<User> getUsersByLastName(String lastName);

    List<User> getUsersByGameType(String gameName);


    void addGameToCollection(String email, Game game);


    Set<Game> getGameCollection(String email);

    void addAvailibilityTimeToList(String email, Availibility availibility);

    List<Availibility> getAvailibilityTimeList(String email);

    List<Availibility> updateAvailibilityTime(String email, Availibility availibility);

    Availibility getAvailibilityTimeById(String email, Long iD);

    void removeGameFromCollection(String email, Game game);

    void addRegistryToGameHistory(String email, GamesHistory gameHistory);

    List<User> findUserByFirstNameAndLastNameAndEmailAdres(String firstname, String lastname, String email);

    List<User> getUsersByFirstName(String firstName);

    public Optional<User> getUserByEMail(String eMail);

}
