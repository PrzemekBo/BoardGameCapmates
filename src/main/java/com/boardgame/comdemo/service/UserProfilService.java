package com.boardgame.comdemo.service;

import com.boardgame.comdemo.domain.User;

public interface UserProfilService {

    void showUserProfileInformation(User user);

    void changeAndSaveNewFirstName(User user,String firstname);
    void changeAndSaveNewLastName(User user,String lastname);
    void changeAndSaveNewEmail(User user,String email);
    void changeAndSaveNewPassword(User user,String password);
    void changeAndSaveNewMotto(User user,String motto);

}
