package com.boardgame.comdemo.domain;

import com.boardgame.comdemo.enums.UserLevel;

import java.util.List;

public class Statistic {

    private int points;
    private int rankingPosition;
    private UserLevel userLevel;
    private List<Match> matchList;

    public Statistic() {

    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(UserLevel userLevel) {
        this.userLevel = userLevel;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    public Statistic(int points, int rankingPosition, UserLevel userLevel, List<Match> matchList) {
        this.points = points;
        this.rankingPosition = rankingPosition;
        this.userLevel = userLevel;
        this.matchList = matchList;
    }
}
