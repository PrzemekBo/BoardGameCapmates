package com.boardgame.comdemo.domain;

import com.boardgame.comdemo.enums.Result;

import java.time.Instant;
import java.util.Set;

public class GamesHistory{

    private Game gamePlayed;
    private Instant dateOfPlay;
    private Result result;
    private int pointsEarned;
    private Set<User> players;

}
