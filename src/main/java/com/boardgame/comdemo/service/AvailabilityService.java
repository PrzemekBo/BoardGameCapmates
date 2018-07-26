package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dto.AvailibilityDTO;
import com.boardgame.comdemo.dto.UserDTO;

import java.util.List;

public interface AvailabilityService {

    List<AvailibilityDTO> addAvailibilityTimeForUser(UserDTO user, AvailibilityDTO availibilityTime);

    List<AvailibilityDTO> updateAvailibilityTime(UserDTO user, AvailibilityDTO availibilityTimeTO);

}
