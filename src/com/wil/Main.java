package com.wil;

public class Main {

    private static Pokemon fire;

    public static void main(String[] args) {
        Pokemon attacker = new Pokemon("pok", 2500, 50);
        Pokemon defenceur = new Pokemon("cat", 150, 1000);
        Pokemon fire = new PokemonFire("Feu",150,100);
        Pokemon plant = new PokemonPlant("plant",250,100);
        PokemonWater water = new PokemonWater("water",100,100);

        // System.out.println("point de vie de cat " + attacker.attack(defenceur));
        attacker.attack(defenceur);
        System.out.println(" point de vie de cat " + defenceur.getHealthPoint());
        //////

        // attaque feu
       // fire.attack(attacker);
        //System.out.println("pok" + attacker.getHealthPoint());
        //System.out.println("feu" + fire.getHealthPoint());
        // attaque plant
        plant.attack(fire);
        System.out.println("feu" + fire.getHealthPoint());
       // feu attaque plant
        fire.attack(plant);
        System.out.println("plant" + plant.getHealthPoint());
        // eau attaque feu
        water.attack(fire);
        System.out.println("feu" + fire.getHealthPoint());


    }
}
