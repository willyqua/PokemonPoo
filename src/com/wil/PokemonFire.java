package com.wil;

public class PokemonFire extends Pokemon {

    public PokemonFire() {
    }

    public PokemonFire(String name, int healthPoint, int attack) {
        super(name, healthPoint, attack);
    }
    // pokemon feu 2*degats contre pok plante
    // pokemon feu 0.5*degat contre pok feu et eau
    // pokemon feu degat normaux contre pok normaux


    @Override
    public void life(Pokemon p) {
        super.life(p);
    }

    public int attack(Pokemon p) {
        // instanceof verifie si p est une attaque de type plante.
        if (p instanceof PokemonPlant) {
            int degats = (2 * this.getAttack());
            p.setHealthPoint(p.getHealthPoint() - (2 * this.getAttack()));
            System.out.println(this.getName() + " la vie " + this.getHealthPoint() + " l'attaque " + getAttack());
            setHealthPoint(p.getHealthPoint() - degats);
            if (p.isDead()) {
                System.out.println("le pokemon " + p.getName() + " est mort");
            }

        } else if (p instanceof PokemonFire || p instanceof PokemonWater) {
            p.setHealthPoint(p.getHealthPoint() - (int) (0.5 * this.getAttack()));
            System.out.println(this.getName() + " la vie " + this.getHealthPoint() + " l'attaque " + getAttack());
        } else {
            super.attack(p);
            System.out.println(this.getName() + " la vie " + this.getHealthPoint() + " l'attaque " + getAttack());
        }
        return getHealthPoint();
    }
}