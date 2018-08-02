package com.boardgame.comdemo.service;


import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.dto.UserSearchTO;

import java.util.List;

public interface UserProfilService {


    UserDTO createUserProfile(UserDTO user);

    UserDTO getProfileInformation(String eMail);

    List<UserDTO> getAllUsers();

    List<UserDTO> findUserByMultipleParam(UserSearchTO user);

    UserDTO update(UserDTO user);

    void deleteUser(String eMail);


}
