package com.boardgame.comdemo.service;

import com.boardgame.comdemo.dto.MatchDTO;
import com.boardgame.comdemo.dto.StatisticDTO;
import com.boardgame.comdemo.enums.UserLevel;

import java.util.List;

public interface UserStatisticService {



    StatisticDTO getUserCurrentStatistics(String email);
    UserLevel getUserCurrentLevel(String email);
    int getUserCurrentRankingPosition(String email);
    List<MatchDTO> getUserHistoryGames(String email);


}
