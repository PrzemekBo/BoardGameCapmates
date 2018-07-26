package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Match;
import com.boardgame.comdemo.domain.Statistic;
import com.boardgame.comdemo.dto.MatchDTO;
import com.boardgame.comdemo.enums.UserLevel;

import java.util.List;
import java.util.Map;

public class StatisticDAOImpl implements StatisticDAO {


    private Map<String, Statistic> usersStatistics;

    @Override
    public Statistic getStatistics(String email) {
        return usersStatistics.get(email);
    }




    @Override
    public UserLevel getUserLevel(String email) {
        return usersStatistics.get(email).getUserLevel();
    }

    @Override
    public int getRanking(String email) {
        {
            return usersStatistics.get(email).getRankingPosition();
        }
    }

    @Override
    public List<Match> getUserGameHistory(String email) {
        return null;
    }

    //  @Override
    //public List<MatchDTO> getUserGameHistory(String email) {
     //   return usersStatistics.get(email).getMatchList();
       // return null;
    }




