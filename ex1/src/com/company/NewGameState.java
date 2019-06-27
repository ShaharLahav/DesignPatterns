package com.company;

public class NewGameState extends State {

    @Override
    public void Hit(Context context) {
        context.hitAlien();
        context.setState(new HealthySpaceshipState());
    }

    @Override
    public void takeDamage(Context context) {
        context.getSpaceship().takeDamage();
        context.setState(new HealthySpaceshipState());
    }
}
