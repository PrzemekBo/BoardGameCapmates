package com.boardgame.comdemo;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.Match;
import com.boardgame.comdemo.domain.Statistic;
import com.boardgame.comdemo.dto.GameDTO;
import com.boardgame.comdemo.dto.StatisticDTO;
import com.boardgame.comdemo.enums.Level;
import com.boardgame.comdemo.enums.UserLevel;

import java.util.List;

public class StatisticMapper {

    public StatisticDTO map(Statistic statistic) {
        StatisticDTO statisticDTO = new StatisticDTO();
        statisticDTO.setPoints(statistic.getPoints());
        statisticDTO.setRankingPosition(statistic.getRankingPosition());
        statisticDTO.setUserLevel(statistic.getUserLevel());
        statisticDTO.setMatchList(statistic.getMatchList());

        return statisticDTO;


    }

    public Statistic map(StatisticDTO statisticDTO) {
        Statistic statistic = new Statistic();
        statistic.setPoints(statistic.getPoints());
        statistic.setRankingPosition(statistic.getRankingPosition());
        statistic.setUserLevel(statistic.getUserLevel());
        statistic.setMatchList(statistic.getMatchList());

        return statistic;

    }
}


