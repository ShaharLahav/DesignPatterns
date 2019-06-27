package com.company;

public class GameLostState extends GameOverState {

    public GameLostState() {
        // Let the user know he lost, afterwards nothing will happen when hitting or taking damage
        System.out.println("Sorry, you lose. Try again");
    }
}
