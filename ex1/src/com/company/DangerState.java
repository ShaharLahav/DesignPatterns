package com.company;

public class DangerState extends InGameState {

    @Override
    public void Hit(Context context) {
        context.hitAlien();
        if (context.getAliens() == 0) {
            if (context.getLevel() == 3) {
                context.setState(new GameWonState());
            }
            else {
                context.LevelUp();
            }
        }
    }

    @Override
    public void takeDamage(Context context) {
        context.getSpaceship().takeDamage();

        if (context.getSpaceship().getHealth() == 0) {
            context.setState(new GameLostState());
        }
    }
}
