package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create game context
        Context gameContext = new Context();
        // Get user input - 'H' is hit 'D' is take damage, print the game
        System.out.println("Welcome to space game simulator - Enter 'h' to hit and 'd' to take damage");
        Scanner sc = new Scanner(System.in);
        do {
            String inputChar = sc.nextLine().toLowerCase();
            switch (inputChar) {
                case "h": {
                    gameContext.Hit();
                    break;
                }
                case "d": {
                    gameContext.takeDamage();
                    break;
                }
                default:
                    System.out.println("Enter 'H' or 'D' only");
                    break;
            }
            System.out.println("Level: " + gameContext.getLevel() + "\t Aliens: "
                    + gameContext.getAliens() + "\t Health: "
                    + gameContext.getSpaceship().getHealth() + "\t State: "
                    + gameContext.getState().toString());
        } while (!(gameContext.getState() instanceof GameOverState));
    }
}
