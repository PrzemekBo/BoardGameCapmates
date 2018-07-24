package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dto.UserDTO;

public interface UserProfilService {

    UserDTO showUserProfileInformation(int id);

    void changeAndSaveNewFirstName(UserDTO userDTO);
    void changeAndSaveNewLastName(UserDTO userDTO);
    void changeAndSaveNewEmail(UserDTO userDTO);
    void changeAndSaveNewPassword(UserDTO userDTO);
    void changeAndSaveNewMotto(UserDTO userDTO);

}
