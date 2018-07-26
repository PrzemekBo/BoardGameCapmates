package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.HoursAvailability;
import com.boardgame.comdemo.domain.User;

import java.time.Instant;
import java.util.List;

public interface HoursAvailabilityDAO {

    void add(String startTime, String endTime);

    List<HoursAvailability> findAll(User user);

    HoursAvailability findByTimePeriod(User user, String from, String to);

    void update(HoursAvailability time, String startTime, String endTime, String message);

    void delete(HoursAvailability time, String message);

}
