package com.edmodo.lection6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pc on 07.12.2016.
 */
class Team {

    private int playerNumbers;
    private Manager manager = new Manager();

    void addTeams() {
        playerNumbers = (int) (Math.random() * 200) + 99;
        for (int j = 0; j < playerNumbers; j++) {
            int playerType = (int) (Math.random() * 11) + 1;
            switch (playerType) {
                case 1:
                case 2:
                case 3:
                    manager.addPlayer(new Forward());
                    break;
                case 4:
                case 5:
                case 6:
                    manager.addPlayer(new Halfback());
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    manager.addPlayer(new Defender());
                    break;
                case 11:
                    manager.addPlayer(new Goalkeeper());
                    break;
            }
        }
        for (SoccerPlayer sP : manager.allPlayers) {
            int randomCountry = (int) (Math.random() * 9) + 1;
            int randomLeague = (int) (Math.random() * 9) + 1;
            sP.setNickName(randomName());
            sP.setPoints(randomPoints());
            sP.setLeague(getRandomLeague(randomLeague));
            sP.setCountry(getRandomCountry(randomCountry));
        }
    }

    private String randomName() {
        String[] names = {"Alex", "Anton", "Artur", "Boris", "Bill", "Brad", "Connor", "Chris", "Clint", "David", "Duke",
                "Eugene", "Egor", "Frank", "Feodor", "George", "Harry", "Igor", "Ivan", "John", "James", "Lukas", "Leonid",
                "Mike", "Nikolay", "Oliver", "Patrick", "Piotr", "Robert", "Stanley", "Tomas", "Teodor", "Viktor"};

        String[] surnames = {"Smith", "Wesson", "Colt", "Browning", "Winchester", "Titov", "Onopko", "Zidane", "Buffon",
                "Lahm", "Kahn", "Podolsky", "Ronaldo", "Beckham", "Casilias", "Alonso", "Honda", "Silva", "Eto'o", "Fernandinho",
                "Messi", "Pele", "Maradona", "Yashin", "Lampard", "Gerrard", "Rooney", "Iniesta", "van Persie", "Puyol", "Riberi",
                "Ibrahimovich", "Pirlo", "Totti"};

        return names[(int) (Math.random() * names.length)] + " " + surnames[(int) (Math.random() * surnames.length)];
    }

    private int randomPoints() {
        return (int) (Math.random() * 48) + 50;
    }

    private Country getRandomCountry(int randomCountry) {
        Country country = null;
        switch (randomCountry) {
            case 1:
                country = Country.RUSSIA;
                break;
            case 2:
                country = Country.GERMANY;
                break;
            case 3:
                country = Country.ENGLAND;
                break;
            case 4:
                country = Country.GREECE;
                break;
            case 5:
                country = Country.NORWAY;
                break;
            case 6:
                country = Country.SPAIN;
                break;
            case 7:
                country = Country.ITALY;
                break;
            case 8:
                country = Country.NETHERLANDS;
                break;
            case 9:
                country = Country.MEXICO;
                break;
        }
        return country;
    }

    private League getRandomLeague(int randomLeague) {
        League league = null;
        switch (randomLeague) {
            case 1:
                league = League.RUS_Premier_League;
                break;
            case 2:
                league = League.Bundesliga;
                break;
            case 3:
                league = League.EN_Premier_League;
                break;
            case 4:
                league = League.Super_League_Ellada;
                break;
            case 5:
                league = League.Tippe_Ligaen;
                break;
            case 6:
                league = League.La_Liga;
                break;
            case 7:
                league = League.Serie_A;
                break;
            case 8:
                league = League.Eredivisie;
                break;
            case 9:
                league = League.Ascenso_MX;
                break;
        }
        return league;
    }

    private String enterPlayerName() {
        System.out.println("\u001b[34;m Введите имя игрока\n");
        Scanner scName = new Scanner(System.in);
        return scName.nextLine();
    }

    void removePlayerFromTeam() {
        for (int i = 0; i < manager.getAllPlayers().size(); i++) {
            if (enterPlayerName().equals(manager.getAllPlayers().get(i).getNickName())) {
                manager.removePlayer(manager.getAllPlayers().get(i));
            }
        }
    }

    void findPlayerByName() {
        System.out.println(manager.getPlayer(enterPlayerName()).toString());
    }

    void showAllPlayers() {
        printPlayersOnDisplay(manager.getAllPlayers());
    }

    void showPlayersByLeague() {
        System.out.println("\u001b[34;m Выберите Лигу:\n");
        System.out.println("\u001b[32;m (1) RUS_Premier_League\n (2) Bundesliga\n (3) EN_Premier_League\n"
                + " (4) Super_League_Ellada\n (5) Tippe_Ligaen\n (6) La_Liga\n (7) Serie_A\n (8) Eredivisie\n (9) Ascenso_MX\n");
        Scanner scLeagueType = new Scanner(System.in);
        String leagueType = scLeagueType.nextLine();
        switch (leagueType) {
            case "1":
                printPlayersOnDisplay(manager.getPlayers(League.RUS_Premier_League));
                break;
            case "2":
                printPlayersOnDisplay(manager.getPlayers(League.Bundesliga));
                break;
            case "3":
                printPlayersOnDisplay(manager.getPlayers(League.EN_Premier_League));
                break;
            case "4":
                printPlayersOnDisplay(manager.getPlayers(League.Super_League_Ellada));
                break;
            case "5":
                printPlayersOnDisplay(manager.getPlayers(League.Tippe_Ligaen));
                break;
            case "6":
                printPlayersOnDisplay(manager.getPlayers(League.La_Liga));
                break;
            case "7":
                printPlayersOnDisplay(manager.getPlayers(League.Serie_A));
                break;
            case "8":
                printPlayersOnDisplay(manager.getPlayers(League.Eredivisie));
                break;
            case "9":
                printPlayersOnDisplay(manager.getPlayers(League.Ascenso_MX));
                break;
        }
    }

    void showPlayersByCountry() {
        System.out.println("\u001b[34;m Выберите страну:\n");
        System.out.println("\u001b[32;m (1) RUSSIA\n (2) GERMANY\n (3) ENGLAND\n (4) GREECE\n (5) NORWAY\n"
                + " (6) SPAIN\n (7) ITALY\n (8) NETHERLANDS\n (9) MEXICO\n");
        Scanner scCountryType = new Scanner(System.in);
        String countryType = scCountryType.nextLine();
        switch (countryType) {
            case "1":
                printPlayersOnDisplay(manager.getPlayers(Country.RUSSIA));
                break;
            case "2":
                printPlayersOnDisplay(manager.getPlayers(Country.GERMANY));
                break;
            case "3":
                printPlayersOnDisplay(manager.getPlayers(Country.ENGLAND));
                break;
            case "4":
                printPlayersOnDisplay(manager.getPlayers(Country.GREECE));
                break;
            case "5":
                printPlayersOnDisplay(manager.getPlayers(Country.NORWAY));
                break;
            case "6":
                printPlayersOnDisplay(manager.getPlayers(Country.SPAIN));
                break;
            case "7":
                printPlayersOnDisplay(manager.getPlayers(Country.ITALY));
                break;
            case "8":
                printPlayersOnDisplay(manager.getPlayers(Country.NETHERLANDS));
                break;
            case "9":
                printPlayersOnDisplay(manager.getPlayers(Country.MEXICO));
                break;
        }
    }

    private void printPlayersOnDisplay(ArrayList<SoccerPlayer> soccerPlayers) {
        System.out.println("\u001b[30;m Всего игроков: " + soccerPlayers.size());
        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            System.out.println(soccerPlayer.toString());
            System.out.println("-----------------------------------");
        }
    }
}
