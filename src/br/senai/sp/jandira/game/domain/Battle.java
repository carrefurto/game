package br.senai.sp.jandira.game.domain;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    String battleWorld;

    Scanner leitor = new Scanner(System.in);

    World world = new World();

    public void battle(Player player, Enemy enemy){
        boolean exit = false;
        while (!exit){

            Random aleatorizadorDano = new Random();


            System.out.println("\n/------------------------- B A T T L E -------------------------/");
            System.out.printf(" Ataque Player [ A ]: %s, life: %s\n", player.getNickname(), player.getLife());
            System.out.printf(" Defesa Player [ D ]: %s, life: %s\n", player.getNickname(), player.getLife());
            System.out.printf("\nAtaque Enemy [ E ]: %s, life: %s\n", enemy.getNickname(), enemy.getLife());
            System.out.printf("\nDefesa Enemy [ F ]: %s, life: %s\n", enemy.getNickname(), enemy.getLife());
            System.out.println("/---------------------------------------------------------------/");

            String ataque = leitor.nextLine();

                if (ataque.equalsIgnoreCase("A")) {
                    System.out.println("/-----------------------/");
                    System.out.println("/-    Player Atacou    -/");
                    System.out.println("/-----------------------/");


                    int ataquePlayer = aleatorizadorDano.nextInt(20) + 1;
                    enemy.subtractLife(ataquePlayer);

                    System.out.printf("O ataque foi de: %s \n", ataquePlayer);

                } else if (ataque.equalsIgnoreCase("E")) {
                    System.out.println("/-----------------------/");
                    System.out.println("/-    Inimigo Atacou   -/");
                    System.out.println("/-----------------------/");

                    int ataqueEnemy = aleatorizadorDano.nextInt(20) + 1;
                    player.subtractLife(ataqueEnemy);

                    System.out.printf("O ataque foi de: %s ", ataqueEnemy);

                } else {
                    System.out.println("Selecione uma tecla válida! ");
                }


            int playerLife = player.getLife();
            if (playerLife <= 0) {
                System.out.printf("O inimigo %s, é o VENCEDOR!", enemy.getNickname());
                exit = true;
            }

            int enemyLife = enemy.getLife();
            if (enemyLife <= 0) {
                System.out.printf("O player %s, é o VENCEDOR!", player.getNickname());
                return;

            }
        }

    }  public void WorldScenario() {
        System.out.println("/------------------------------/");
        System.out.println("/     ESCOLHA UM CENÁRIO: /");
        System.out.println("/------------------------------/");
        System.out.println("[ 1 ] - floresta");
        System.out.println("[ 2 ] - Caverna");
        System.out.println("[ 3 ] - Deserto");
        System.out.println("[ Default - Senai Jandira ]");

        int WorldSelected = leitor.nextInt();
        leitor.nextLine();

        battleWorld = world.World(WorldSelected);

    }
}


