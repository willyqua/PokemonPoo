package com.wil;

public class PokemonWater extends  Pokemon{

    public PokemonWater(){}

    public PokemonWater(String name, int healthPoint, int attack) {
        super(name, healthPoint, attack);
    }
    public int attack(Pokemon p) {
// instanceof verifie si p est une attaque de type plante.
        if (p instanceof PokemonFire) {
            int degats = (2 * this.getAttack());
            p.setHealthPoint(p.getHealthPoint() - (2 * this.getAttack()));
            System.out.println(this.getName() + " la vie " + this.getHealthPoint() + " l'attaque " + getAttack());
            setHealthPoint(p.getHealthPoint() - degats);

        } else if (p instanceof PokemonPlant || p instanceof PokemonWater) {
            p.setHealthPoint(p.getHealthPoint() - (int) (0.5 * this.getAttack()));
            System.out.println(this.getName() + " la vie " + this.getHealthPoint() + " l'attaque " + getAttack());
        } else {
            super.attack(p);
            System.out.println(this.getName() + " la vie " + this.getHealthPoint() + " l'attaque " + getAttack());
        }
        return getHealthPoint();
    }

}
