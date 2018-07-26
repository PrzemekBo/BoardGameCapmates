package com.boardgame.comdemo.dao.impl;

import com.boardgame.comdemo.dao.HoursAvailabilityDAO;
import com.boardgame.comdemo.domain.HoursAvailability;
import com.boardgame.comdemo.domain.User;

import java.util.ArrayList;
import java.util.List;

public class HoursAvailabilityDAOImpl implements HoursAvailabilityDAO {


    private List<HoursAvailability> listOfHoursAvailability;


    public HoursAvailabilityDAOImpl(){
        listOfHoursAvailability = new ArrayList<>();
        this.listOfHoursAvailability.add(new HoursAvailability("13:36","14:45","sfdsdfds"));
        this.listOfHoursAvailability.add(new HoursAvailability("13:36","14:45","sfdsdfds"));
        this.listOfHoursAvailability.add(new HoursAvailability("13:36","14:45","sfdsdfds"));

    }
    @Override
    public void add(String startTime, String endTime) {
        if (startTime!=null&&endTime!=null){
            HoursAvailability hoursAvailability= new HoursAvailability();;
            hoursAvailability.setStartTime(startTime);
            hoursAvailability.setEndTime(endTime);

        }

    }

    @Override
    public List<HoursAvailability> findAll(User user) {

        return null;
    }

    @Override
    public HoursAvailability findByTimePeriod(User user, String from, String to) {

        return null;
    }


    @Override
    public void update(HoursAvailability time, String startTime, String endTime, String message) {
        time.setStartTime(startTime);
        time.setEndTime(endTime);
        time.setMessage(message);


    }

    @Override
    public void delete(HoursAvailability time, String message) {
        time.setStartTime(null);
        time.setEndTime(null);
        time.setMessage(message);

    }
}
