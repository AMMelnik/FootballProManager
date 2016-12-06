package com.edmodo.lection6;

/**
 * Created by pc on 07.12.2016.
 */
public class Manager implements LeagueManager {

    @Override
    public void addPlayer(SoccerPlayer player) {
        for (Country country : Country.values()) {

        }
    }

    @Override
    public void removePlayer(SoccerPlayer player) {

    }

    @Override
    public SoccerPlayer getPlayer(String name) {
        return null;
    }

    @Override
    public SoccerPlayer[] getAllPlayers() {
        return new SoccerPlayer[0];
    }

    @Override
    public SoccerPlayer[] getPlayers(League league) {
        return new SoccerPlayer[0];
    }

    @Override
    public SoccerPlayer[] getPlayers(Country country) {
        return new SoccerPlayer[0];
    }

    @Override
    public void addPoints(String name, int points) {

    }
}
