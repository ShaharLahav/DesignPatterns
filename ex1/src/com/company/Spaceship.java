package com.company;

public class Spaceship {
    private int health;

    public Spaceship() {
        this.health = 50;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage() {
        this.health = this.health - 1;
    }
}
