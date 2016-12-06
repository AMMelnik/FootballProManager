package com.edmodo.lection6;

/**
 * Created by pc on 06.12.2016.
 */
public interface SoccerPlayer {

    //  Получение ФИО игрока
    String getNickName();

    // Рейтинг игрока
    Integer getPoints();

    // Лига игрока
    League getLeague();

    // Страна происхождения
    Country getCountry();

    void setNickName(String name);

    void setPoints(int points);

    void setLeague(League league);

    void setCountry(Country country);
}
