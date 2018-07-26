package com.boardgame.comdemo.enums;

public enum Result {


    WIN(30),
    DRAW(10),
    LOST(0),
    FIRST_PLACE(10),
    SECOND_PLACE(6),
    THIRD_PLACE(3);

    private final int points;

    private Result(int value) {
        this.points = value;
    }

    public int getPoints() {
        return points;
    }
}
