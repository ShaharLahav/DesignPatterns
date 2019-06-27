package com.company;

public class Context {
    private Spaceship spaceship;
    private State state;
    private int level;
    private int aliens;

    public Context() {
        this.level = 0;
        this.LevelUp();
        this.spaceship = new Spaceship();
        this.state = new NewGameState();
    }

    public void Hit() {
        this.state.Hit(this);
    }

    public void takeDamage() {
        this.state.takeDamage(this);
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getLevel() {
        return level;
    }

    public int getAliens() {
        return aliens;
    }

    public void setAliens(int aliens) {
        this.aliens = aliens;
    }

    public void LevelUp() {
        this.level++;
        switch (this.level) {
            case 1: {
                this.aliens = 10;
                break;
            }
            case 2: {
                this.aliens = 20;
                break;
            }
            case 3: {
                this.aliens = 20;
                break;
            }
        }
    }

    public void hitAlien() {
        if (this.getAliens() > 0) {
            this.setAliens(this.getAliens() - 1);
        }
    }
}
