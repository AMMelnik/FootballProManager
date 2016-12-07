package com.edmodo.lection6;

import java.util.Scanner;

/**
 * Created by pc on 07.12.2016.
 */

public class Main {

    public static void main(String[] args) {
        boolean isManagementEnd = false;
        Team team = new Team();
        team.addTeams();
        System.out.println("\u001b[34;m Приветствую, Менеджер!\n");
        while (!isManagementEnd) {
            System.out.println("\u001b[34;m Выберите действие:\n");
            System.out.println("\u001b[32;m (1) Показать всех игроков\n (2) Показать игроков Лиги\n" +
                    " (3) Показать игроков страны\n (4) Уволить игрока\n (5) Найти игрока по имени\n (6) Выйти\n");
            Scanner scEntryType = new Scanner(System.in);
            String entryType = scEntryType.nextLine();
            switch (entryType) {
                case "1":
                    team.showAllPlayers();
                    break;
                case "2":
                    team.showPlayersByLeague();
                    break;
                case "3":
                    team.showPlayersByCountry();
                    break;
                case "4":
                    team.removePlayerFromTeam();
                    break;
                case "5":
                    team.findPlayerByName();
                    break;
                case "6":
                    System.out.println("\u001b[30;m Всего доброго!");
                    isManagementEnd = true;
                    break;
                default:
                    System.out.println("\u001b[34;m Пожалуйста, выберите нужное действие (1 - 6)\n");
                    break;
            }
        }
    }
}
