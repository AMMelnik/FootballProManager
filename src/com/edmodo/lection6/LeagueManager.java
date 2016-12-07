package com.edmodo.lection6;

import java.util.ArrayList;

/**
 * Created by pc on 06.12.2016.
 */
interface LeagueManager {

    void addPlayer(SoccerPlayer player);

    void removePlayer(SoccerPlayer player);

    SoccerPlayer getPlayer(String name);

    ArrayList<SoccerPlayer> getAllPlayers();

    ArrayList<SoccerPlayer> getPlayers(League league);

    ArrayList<SoccerPlayer> getPlayers(Country country);

    void addPoints(String name, int points);
}
