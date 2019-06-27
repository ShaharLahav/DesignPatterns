package com.company;

public abstract class GameOverState extends State {
    @Override
    public void Hit(Context context) {
        // do nothing - game is over
    }

    @Override
    public void takeDamage(Context context) {
        // do nothing - game is over
    }
}
