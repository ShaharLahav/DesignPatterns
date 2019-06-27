package com.company;

public class HealthySpaceshipState extends InGameState {

    @Override
    public void takeDamage(Context context) {
        context.getSpaceship().takeDamage();

        if (context.getSpaceship().getHealth() < 30) {
            context.setState(new DangerState());
        }
    }
}
