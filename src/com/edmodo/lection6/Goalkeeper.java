package com.edmodo.lection6;

/**
 * Created by pc on 07.12.2016.
 */
public class Goalkeeper implements SoccerPlayer {

    private String nickName;
    private int points;
    private League league;
    private Country country;
    private String playerType;

    @Override
    public String getNickName() {
        return nickName;
    }

    @Override
    public void setNickName(String name) {
        nickName = name;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public League getLeague() {
        return league;
    }

    @Override
    public void setLeague(League league) {
        this.league = league;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public void setCountry(Country country) {
        this.country = country;
    }

    String getPlayerType() {
        return playerType = "Вратарь";
    }

    @Override
    public String toString() {
        return "\u001b[31;m Игрок\u001b[34;m " + nickName + ".\n\u001b[31;m Лига:\u001b[34;m " + getLeague() +
                ".\n\u001b[31;m Специализация:\u001b[34;m " + getPlayerType() + "\n\u001b[31;m Рейтинг:\u001b[34;m " + getPoints() + "\n\n";
    }
}
