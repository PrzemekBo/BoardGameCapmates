package com.boardgame.comdemo.service;

import com.boardgame.comdemo.domain.User;
import com.boardgame.comdemo.repository.GameRepository;
import com.boardgame.comdemo.repository.GameRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    @Autowired
    private GameRepositoryImpl gameRepositoryImpl;



    public void showUserGameCollection(User user) {
        System.out.println();

    }
}
