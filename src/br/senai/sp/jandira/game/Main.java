package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.domain.Battle;
import br.senai.sp.jandira.game.domain.Enemy;
import br.senai.sp.jandira.game.domain.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Player player = new Player();
        Enemy enemy = new Enemy();

        boolean exit = false;

        while (!exit){
            System.out.println("\n/--------------------------- M E N U -----------------------------/");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - REGISTER NEW PLAYER");
            System.out.println("2 - REGISTER NEW ENEMY");
            System.out.println("3 - PLAYER INFORMATION ");
            System.out.println("4 - ENEMY INFORMATION ");
            System.out.println("5 - NEW BATTLE ");
            System.out.println("6 - EXIT");
            System.out.println("/-------------------------------------------------------------------/");

            int userOption = leitor.nextInt();

            switch (userOption){
                case 1:
                    player.RegisteredPlayer();
                    break;

                case 2:
                    enemy.RegisteredEnemy();
                    break;

                case 3:
                    player.showData();
                    break;

                case 4:
                    enemy.showData();
                    break;

                case 5:
                    Battle battle = new Battle();
                    battle.WorldScenario();
                    battle.battle(player, enemy);
                    player.setLife(100);
                    enemy.setLife(100);
                    break;

                case 6:
                    exit = true;
                    break;

            }







        }

    }
}
