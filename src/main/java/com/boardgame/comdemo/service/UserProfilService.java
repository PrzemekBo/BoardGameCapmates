package com.boardgame.comdemo.service;


import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.dto.UserSearchTO;

import java.util.List;

public interface UserProfilService {


    UserDTO createUserProfile(UserDTO user);

    UserDTO getProfileInformation(String email);

    UserDTO update(UserDTO user);

   // public List<User> searchUsers(String firstName, String lastName, String email);

    List<UserDTO> getAllUsers();

    List<UserDTO> findUserByMultipleParam(UserSearchTO user);

    void deleteUser(String eMail);






}
