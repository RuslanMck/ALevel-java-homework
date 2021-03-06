package com.Ruslan.ALevel.player;

import com.Ruslan.ALevel.league.Leagues;

import java.util.ArrayList;

public class PlayersCreator {

    private PlayersFactory playersFactory = new PlayersFactory();

    public ArrayList<BasePlayer> createPlayers(Leagues leagues, int playersNum) {
        ArrayList<BasePlayer> players = new ArrayList<>();
        for (int i = 0; i < playersNum; i++) {
            players.add(playersFactory.createPlayer(leagues));
        }
        return players;
    }
}
