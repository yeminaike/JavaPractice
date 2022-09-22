package tdd;

import java.security.SecureRandom;

public class Craps {

    public int sum;
    private int myPoint;
    public Status gameStatus;

    public enum Status {CONTINUE, WON, LOST};
    private final SecureRandom randomNumber = new SecureRandom();


    public void rollDice() {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        sum = die1 + die2;
    }

    public Status getStatus() {

        switch(sum){
            case 7, 11 -> gameStatus = Status.WON;
            case 2, 3, 12 -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sum;
            }
        }
        return gameStatus;
    }

    public int getMyPoint() {
        return myPoint;
    }



}


