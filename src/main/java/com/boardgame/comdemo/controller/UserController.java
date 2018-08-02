package com.boardgame.comdemo.controller;


import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.dto.UserSearchTO;
import com.boardgame.comdemo.service.UserProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserProfilService userProfilService;

    @Autowired
    public UserController(UserProfilService userProfileService) {
        this.userProfilService = userProfileService;
    }


    //TODo
    @PostMapping(value = "/add")
    public UserDTO addNewUser(@RequestBody UserDTO userDTO) {
        return userProfilService.createUserProfile(userDTO);
    }

    //TODO
    @GetMapping(value = "/find")
    public UserDTO findUserByEMail(@RequestParam("email") String email) {
        return userProfilService.getProfileInformation(email);
    }

    //TODO
    @GetMapping(value = "/")
    public List<UserDTO> findtUeserByEMail() {
        return userProfilService.getAllUsers();
    }


    //TODO
    @PutMapping(value = "/update")
    public UserDTO updateUserProfile(@RequestBody UserDTO userDTO) {
        return userProfilService.update(userDTO);
    }


    //TODO
    @DeleteMapping(value = "/delete")
    public void deleteUser(@RequestParam("email") String email) {
        userProfilService.deleteUser(email);
    }


    @RequestMapping(value = "/search")
    public List<UserDTO> findUsers(@RequestBody UserSearchTO user) {
        return userProfilService.findUserByMultipleParam(user);
    }


}




