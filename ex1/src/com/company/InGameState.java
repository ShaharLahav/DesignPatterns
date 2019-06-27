package com.company;

public abstract class InGameState extends State {
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
}
