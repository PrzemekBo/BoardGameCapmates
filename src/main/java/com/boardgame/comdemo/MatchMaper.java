package com.boardgame.comdemo;

import com.boardgame.comdemo.domain.Game;
import com.boardgame.comdemo.domain.Match;
import com.boardgame.comdemo.dto.GameDTO;
import com.boardgame.comdemo.dto.MatchDTO;

public class MatchMaper {
    public MatchDTO matchDTO(Match match) {
        MatchDTO matchDTO = new MatchDTO();
        matchDTO.setUserOne(match.getUserOne());
        matchDTO.setUserTwo(match.getUserTwo());
        return matchDTO;


    }

    public Match map(MatchDTO matchDTO) {
        Match match = new Match();
        match.setUserOne(matchDTO.getUserOne());
        match.setUserTwo(matchDTO.getUserTwo());
        return match;


    }
}
