package com.wil;

public class Pokemon {

    private String name;
    private int healthPoint;
    private int attack;
    private boolean isDead;


    public Pokemon() {
    }

    public Pokemon(String name, int healthPoint, int attack) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.attack = attack;

    }

    /*public Pokemon(boolean isDead) {
        this.isDead = isDead;
    }*/

    public boolean isDead() {
        if (this.healthPoint <= 0) {
            this.isDead = true;
        }
        return isDead;


    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void life(Pokemon p) {
        if (p.isDead) {
            System.out.println("le pokemon " + this.getName()+ " " + p.getName() + " est mort");
        }

    }

    // le Pokemon va attaquer le pokemon p . signature de la méthode
    // faire l'attaque du pokemon sur le pokemon p . le 1er comportement.
    // soustraire au pokemon p qui se fait attaques les point de vie, =>
    // qui corresponde a this.healthpoint la vie du pokemon p .
    // récupére le restant de la vie du pokemon p apres l'attaque.
    // retourner la vie.
    public int attack(Pokemon p) {

        p.healthPoint -= this.getAttack();
        /*if(p.getHealthPoint() <= 0){

            System.out.println("le pokémon " + p.getName() + " est mort");
        }*/
        //p.attack -= this.healthPoint;
        // int remainingLife = (this.healthPoint - p.attack);

        // System.out.println(remainingLife);
        return healthPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


}
