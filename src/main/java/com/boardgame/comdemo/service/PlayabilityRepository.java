package com.boardgame.comdemo.service;

import com.boardgame.comdemo.domain.HoursAvailability;

public interface PlayabilityRepository {

    void addAvailabilityHours(HoursAvailability hoursAvailability);

    HoursAvailability editAvailabilityHours(HoursAvailability hoursAvailability);
}
