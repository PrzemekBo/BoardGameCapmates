package com.boardgame.comdemo.service;


import com.boardgame.comdemo.dto.UserDTO;

public interface UserProfilService {


    UserDTO createUserProfile(UserDTO user);

    UserDTO getProfileInformation(String email);

    UserDTO update(UserDTO user);


}
