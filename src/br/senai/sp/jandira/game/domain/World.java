package br.senai.sp.jandira.game.domain;

public class World {

    public String World(int worldSelect){

        String world = "Senai Jandira";


        switch (worldSelect){
            case 1:
                world = "Floresta";
                break;

            case 2:
                world = "Caverna";
                break;

            case 3:
                world = "Deserto";
                break;
        }
        return world;
    }






}
