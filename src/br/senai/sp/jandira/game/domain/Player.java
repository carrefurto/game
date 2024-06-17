package br.senai.sp.jandira.game.domain;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private String nickname;
    private String skin;
    private int life;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getNickname() {
        return nickname;
    }

    public Player(){
        life = 100;
    }

    Scanner leitor = new Scanner(System.in);

    public void RegisteredPlayer(){

        System.out.println("/------------------------ Register Player --------------------------/");
        System.out.print("Digite um nickname: ");
        this.nickname = leitor.nextLine();
        System.out.print("Escolha uma skin: ");
        this.skin = leitor.nextLine();
    }
    public void showData(){
        System.out.println("/--------------------------- P L A Y E R --------------------------------/");
        System.out.printf("Player: %s\n", this.nickname);
        System.out.printf("Skin: %s\n", this.skin);
        System.out.printf("Life: %s\n", this.life);
    }

    public void subtractLife(int danoEnemy){
        life -= danoEnemy;

        if (life < 0 ){
            life = 0;
        }
    }

    public void defendAttack(int danoRecebido){
        Random aleatorizadorDefesa = new Random();
        Random numeroAleatorio = new Random();

        String defesa = leitor.nextLine();

        System.out.println("Escolha um Número entre 1 - 5");
        int numeroEscolhido = leitor.nextInt();

        if (numeroAleatorio.equals(numeroEscolhido)){
        }

        if (defesa.equalsIgnoreCase("A")) {
            System.out.println("/-----------------------/");
            System.out.println("/-    Player Defendeu    -/");
            System.out.println("/-----------------------/");

            int defesaDoPlayer = aleatorizadorDefesa.nextInt(10) + 1;

    }


}
