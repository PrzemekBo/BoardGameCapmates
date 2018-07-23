package com.boardgame.comdemo.service;

import com.boardgame.comdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameServiceImpl {

    @Autowired
    private GameServiceImpl gameRepositoryImpl;



    public void showUserGameCollection(User user) {
        System.out.println();

    }
}
