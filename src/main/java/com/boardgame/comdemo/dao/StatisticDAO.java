package com.boardgame.comdemo.dao;

import com.boardgame.comdemo.domain.Match;
import com.boardgame.comdemo.domain.Statistic;
import com.boardgame.comdemo.dto.MatchDTO;
import com.boardgame.comdemo.enums.UserLevel;

import java.util.List;

public interface StatisticDAO {

    Statistic getStatistics(String email);

    UserLevel getUserLevel(String email);

    int getRanking(String email);

    List<Match> getUserGameHistory(String email);

}
