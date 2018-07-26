package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dto.UserDTO;

public interface UserProfilService {

    UserDTO showUserProfileInformation(String email);

    UserDTO update(UserDTO user);

    UserDTO createUserProfile(UserDTO user);

    void changeAndSaveNewFirstName(int id, String firstname);
    void changeAndSaveNewLastName(int id,String lastname);
    void changeAndSaveNewEmail(int id, String email);
    void changeAndSaveNewPassword(int id,String password);
    void changeAndSaveNewMotto(int id,String motto);

}
