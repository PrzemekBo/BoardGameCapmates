package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dao.GameDAO;
import com.boardgame.comdemo.dao.UserDAO;
import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.HoursAvailability;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HoursAvailabilityService {

    private UserDAO userDAO;
    private GameDAO gameDAO;

    private List<HoursAvailability> listOfHoursAvailability;

    /*public HoursAvailabilityService(){
        listOfHoursAvailability = new ArrayList<>();
        this.listOfHoursAvailability.add(new HoursAvailability("15:30","15:30","No siema"));
        this.listOfHoursAvailability.add(new Game(2,"Bierki"));
        this.listOfHoursAvailability.add(new Game(3,"Szachy"));


    }
*/


    public void addUserPlayabilityHours(int userId, String startTime, String endTime) {
        LocalTime startHour = LocalTime.parse(startTime);
        LocalTime endHour = LocalTime.parse(endTime);

        userDAO.findById(userId).setHoursAvailability(new HoursAvailability(startHour, endHour, ""));
    }
    public void editUserPlayabilityHours(int userId, String startTime, String endTime, String message) {
        HoursAvailability hoursAvailability = userDAO.findById(userId).getHoursAvailability();
        hoursAvailability.setStartTime(LocalTime.parse(startTime));
        hoursAvailability.setEndTime(LocalTime.parse(endTime));
        hoursAvailability.setMessage(message);
    }


    public void removeUserPlayabilityHours(int userId, String message) {
        HoursAvailability hoursAvailability = userDAO.findById(userId).getHoursAvailability();
        hoursAvailability.setStartTime(LocalTime.parse("0:00"));
        hoursAvailability.setEndTime(LocalTime.parse("0:00"));
        hoursAvailability.setMessage(message);
    }

}
