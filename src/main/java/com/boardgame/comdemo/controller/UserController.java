package com.boardgame.comdemo.controller;


import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.dto.UserSearchTO;
import com.boardgame.comdemo.service.UserProfilService;
import com.boardgame.comdemo.service.impl.UserProfilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserProfilService userProfilService;

    @Autowired
    public UserController(UserProfilService userProfileService) {
        this.userProfilService = userProfileService;
    }


    //TODO
    @PostMapping(value = "/add")
    public UserDTO addNewUser(@RequestBody UserDTO userDTO) {
        return userProfilService.createUserProfile(userDTO);
    }


    @GetMapping(value = "/find/{email}")
    public UserDTO findUserByEMail(@PathVariable("email") String email) {
        return userProfilService.getProfileInformation(email);
    }

    //TODO
    @GetMapping(value = "/")
    public List<UserDTO> findtUeserByEMail() {
        return userProfilService.getAllUsers();
    }


 /*   @GetMapping(value = "/find/{email}")
    public UserDTO findtUserByEMail(@PathVariable("email") String email) {
        return userProfilService.getProfileInformation(email);
    }*/


 //TODO
    @PutMapping(value = "/update")
    public UserDTO updateUserProfile(@RequestBody UserDTO userDTO) {
        return userProfilService.update(userDTO);
    }


    //TODO
    @DeleteMapping(value = "/delete{email}")
    public void deleteUser(@PathVariable("email") String email) {
        userProfilService.deleteUser(email);
    }


    @GetMapping(value = "/search")
    public List<UserDTO> findUsers(@RequestBody UserSearchTO user) {
        return userProfilService.findUserByMultipleParam(user);
    }


   /* @RequestMapping(value = "/createUser/{userDTO}", method = RequestMethod.POST)
    public UserDTO createUser(@PathVariable UserDTO userDTO){
        ModelAndView mav= new ModelAndView("createUser");
        mav.addObject("user",userProfilService.createUserProfile(userDTO));
        return userProfilService.createUserProfile(userDTO);

    }

    @RequestMapping(value = "/information",method = RequestMethod.GET)
    public UserDTO getProfileInformation(@PathVariable String email){
        ModelAndView mav = new ModelAndView("information");
        mav.addObject("user",userProfilService.getProfileInformation(email));
        return userProfilService.getProfileInformation(email);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public UserDTO update(@PathVariable UserDTO userDTO){
        ModelAndView mav= new ModelAndView("update") ;
        mav.addObject("user",userProfilService.update(userDTO));
        return userProfilService.update(userDTO);
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> searchUsersByParameters(
            @RequestParam(value = "firstName", required = false)String firstName,
            @RequestParam(value = "lastName", required = false)String lastName,
            @RequestParam(value = "email", required = false)String email) {
        return userProfilService.searchUsers(firstName, lastName, email);

    }*/
}




