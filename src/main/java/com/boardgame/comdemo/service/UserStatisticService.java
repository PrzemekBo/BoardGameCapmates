package com.boardgame.comdemo.service;

import com.boardgame.comdemo.domain.User;

public interface UserStatisticService {

    void showUserStatistics(User user);
    void showUserLevel(User user);
    void showRankingPosition(User user);


}
