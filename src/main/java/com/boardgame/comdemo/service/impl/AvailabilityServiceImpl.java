package com.boardgame.comdemo.service.impl;

import com.boardgame.comdemo.mapper.UserMapper;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.Availibility;
import com.boardgame.comdemo.dto.AvailibilityDTO;
import com.boardgame.comdemo.dto.UserDTO;
import com.boardgame.comdemo.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AvailabilityServiceImpl implements AvailabilityService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Availibility availibility;

    @Override
    public List<AvailibilityDTO> addAvailibilityTimeForUser(UserDTO user, AvailibilityDTO availibilityTime) {

   return null;

    }

    @Override
    public List<AvailibilityDTO> updateAvailibilityTime(UserDTO user, AvailibilityDTO availibilityTimeTO) {
        return null;
    }
}
