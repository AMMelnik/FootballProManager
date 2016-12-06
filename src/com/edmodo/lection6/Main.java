package com.edmodo.lection6;

import java.util.ArrayList;

/**
 * Created by pc on 07.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        int playerNumbers;
       // League lig = new League().getLeagueNameById();
        System.out.println("\u001b[34;m Приветствую, Менеджер!\n \u001b[30;m Пришло время изучить современное футбольное сообщество!\n");
        for (int i = 0; i < 9; i++) {
            playerNumbers = (int) (Math.random() * 20) + 12;
            ArrayList<SoccerPlayer> players = new ArrayList<>(playerNumbers);
            for (int j = 0; j < playerNumbers; j++) {
                int playerType = (int) (Math.random() * 11) + 1;
                switch (playerType) {
                    case 1:
                    case 2:
                    case 3:
                        players.add(j, new Forward());
                        break;
                    case 4:
                    case 5:
                    case 6:
                        players.add(j, new Halfback());
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        players.add(j, new Defender());
                        break;
                    case 11:
                        players.add(j, new Goalkeeper());
                        break;
                }
            }
            for (SoccerPlayer sP : players) {
                sP.setNickName(randomName());
                sP.setPoints(randomPoints());
            //    sP.setLeague(lig.getLeagueNameById(i + 1));
                System.out.println(sP.toString());
            }
        }
    }

    static String randomName() {
        String[] names = {"Alex", "Anton", "Artur", "Boris", "Bill", "Brad", "Connor", "Chris", "Clint", "David", "Duke",
                "Eugene", "Egor", "Frank", "Feodor", "George", "Harry", "Igor", "Ivan", "John", "James", "Lukas", "Leonid",
                "Mike", "Nikola", "Oliver", "Patrick", "Piotr", "Robert", "Stanley", "Tomas", "Teodor", "Viktor"};

        String[] surnames = {"Smith", "Wesson", "Colt", "Browning", "Winchester", "Titov", "Onopko", "Zidane", "Buffon",
                "Lahm", "Kahn", "Podolsky", "Ronaldo", "Beckham", "Casil", "Alonso", "Honda", "Silva", "Eto'o", "Fernandinho",
                "Messi", "Pele", "Maradona", "Yashin", "Lampard", "Gerrard", "Rooney", "Iniesta", "van Persie", "Puyol", "Riberi",
                "Ibrahimovich", "Pirlo", "Totti"};

        return names[(int) (Math.random() * names.length)] + " " + surnames[(int) (Math.random() * surnames.length)];
    }

    static int randomPoints() {
        return (int) (Math.random() * 48) + 50;
    }
}
