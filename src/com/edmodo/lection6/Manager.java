package com.edmodo.lection6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by pc on 07.12.2016.
 */
class Manager implements LeagueManager {

    ArrayList<SoccerPlayer> allPlayers = new ArrayList<>();

    @Override
    public void addPlayer(SoccerPlayer player) {
        allPlayers.add(player);
    }

    @Override
    public void removePlayer(SoccerPlayer player) {
        allPlayers.remove(player);
    }

    @Override
    public SoccerPlayer getPlayer(String name) {
        for (int i = 0; i < allPlayers.size(); i++) {
            if (allPlayers.get(i).getNickName().equals(name)) {
                return allPlayers.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<SoccerPlayer> getAllPlayers() {
        Collections.sort(allPlayers, COMPARE_BY_POINTS);
        return allPlayers;
    }

    @Override
    public ArrayList<SoccerPlayer> getPlayers(League league) {
        ArrayList<SoccerPlayer> leaguePlayers = new ArrayList<>();
        for (int i = 0; i < allPlayers.size(); i++) {
            if (allPlayers.get(i).getLeague().equals(league)) {
                leaguePlayers.add(allPlayers.get(i));
            }
        }
        Collections.sort(leaguePlayers, COMPARE_BY_POINTS);
        return leaguePlayers;
    }

    @Override
    public ArrayList<SoccerPlayer> getPlayers(Country country) {
        ArrayList<SoccerPlayer> countryPlayers = new ArrayList<>();
        for (int i = 0; i < allPlayers.size(); i++) {
            if (allPlayers.get(i).getCountry().equals(country)) {
                countryPlayers.add(allPlayers.get(i));
            }
        }
        Collections.sort(countryPlayers, COMPARE_BY_POINTS);
        return countryPlayers;
    }

    @Override
    public void addPoints(String name, int points) {
        for (int i = 0; i < allPlayers.size(); i++) {
            if (allPlayers.get(i).getNickName().equals(name)) {
                allPlayers.get(i).setPoints(points);
            }
        }
    }

    private static final Comparator<SoccerPlayer> COMPARE_BY_POINTS =
            (lowPoints, highPoints) -> highPoints.getPoints() - lowPoints.getPoints();

}
