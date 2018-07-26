package com.boardgame.comdemo.dto;

public class HoursAvailabilityDTO {

    private String startTime;
    private String endTime;
    private String message;




    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HoursAvailabilityDTO(String startTime, String endTime, String message) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.message = message;
    }
}
