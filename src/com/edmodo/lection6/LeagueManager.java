package com.edmodo.lection6;

/**
 * Created by pc on 06.12.2016.
 */
public interface LeagueManager {

    public void addPlayer(SoccerPlayer player);

    public void removePlayer(SoccerPlayer player);

    public SoccerPlayer getPlayer(String name);

    public SoccerPlayer[] getAllPlayers();

    public SoccerPlayer[] getPlayers(League league);

    public SoccerPlayer[] getPlayers(Country country);

    public void addPoints(String name, int points);
}
