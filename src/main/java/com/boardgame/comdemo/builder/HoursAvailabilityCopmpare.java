package com.boardgame.comdemo.domain;

import java.time.LocalTime;

public class HoursAvailabilityCopmpare {

    public boolean compare(HoursAvailability firstPlayability, HoursAvailability secondPlayability){

        LocalTime firstPlayerStartTime = firstPlayability.getStartTime();
        LocalTime firstPlayerEndTime = firstPlayability.getEndTime();
        LocalTime secondPlayerStartTime = secondPlayability.getStartTime();
        LocalTime secondPlayerEndTime = secondPlayability.getEndTime();

        if (firstPlayerStartTime.compareTo(secondPlayerEndTime) < 0){
            return firstPlayerEndTime.compareTo(secondPlayerStartTime) > 0;
        }
        return false;
    }
}
