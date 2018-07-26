package com.boardgame.comdemo.service;

import com.boardgame.comdemo.MatchMaper;
import com.boardgame.comdemo.StatisticMapper;
import com.boardgame.comdemo.dao.StatisticDAO;
import com.boardgame.comdemo.dao.StatisticDAOImpl;
import com.boardgame.comdemo.dto.MatchDTO;
import com.boardgame.comdemo.dto.StatisticDTO;
import com.boardgame.comdemo.enums.UserLevel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserStatisticServiceImpl implements UserStatisticService {
    @Autowired
    StatisticMapper statisticMapper;

  /*  @Autowired
    MatchMaper matchMaper;*/

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    StatisticDAO statisticDAO;

    StatisticDAOImpl statisticDAOImpl;

    @Override
    public StatisticDTO getUserCurrentStatistics(String email) {
        return statisticMapper.map(statisticDAO.getStatistics(email));
    }

    @Override
    public UserLevel getUserCurrentLevel(String email) {
        return statisticDAO.getUserLevel(email);

    }

    @Override
    public int getUserCurrentRankingPosition(String email) {
        return statisticDAO.getRanking(email);
    }

    @Override
    public List<MatchDTO> getUserHistoryGames(String email) {
  /*       modelMapper.map(statisticDAO.getUserGameHistory(email)
        return modelMapper.map(statisticDAO.getUserGameHistory(email));*/
  return null;
    }



}
