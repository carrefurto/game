package br.senai.sp.jandira.game.domain;

import java.util.Scanner;

public class Enemy {

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

    public Enemy(){
        life = 100;
    }

    Scanner leitor = new Scanner(System.in);

    public void RegisteredEnemy(){

        System.out.println("/------------------------ Register Player --------------------------/");
        System.out.print("Digite um nickname: ");
        this.nickname = leitor.nextLine();
        System.out.print("Escolha uma skin: ");
        this.skin = leitor.nextLine();
        }

    public void showData(){
        System.out.println("/--------------------------- E N E M Y --------------------------------/");
        System.out.printf("Enemy: %s\n", this.nickname);
        System.out.printf("Skin: %s\n", this.skin);
        System.out.printf("Life: %s\n", this.life);
    }
    public void subtractLife(int danoPlayer){
        life -= danoPlayer;

        if (life < 0 ){
            life = 0;
        }
    }
}
