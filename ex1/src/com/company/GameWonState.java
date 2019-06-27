package com.company;

public class GameWonState extends GameOverState {

    public GameWonState() {
        // Let the user know he won, afterwards nothing will happen when hitting or taking damage
        System.out.println("Congrats! You won the Game! Restart program to enter a new game");
    }
}
