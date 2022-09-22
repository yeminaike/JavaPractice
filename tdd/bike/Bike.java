package tdd.bike;

public class Bike {
    private boolean power;
    private int acceleration;
    private int decceleration;
    private int gearRang;

    public void setOn(boolean value) {
        power = value;
    }

    public boolean getOn() {
        return power;
    }

    public void setAcceleration(int gear) {
        if (gear == 1) {
            acceleration = gear + 1;
        }
        if (gear == 2) {
            acceleration = gear + 2;
        }
        if (gear == 3) {
            acceleration = gear + 3;
        }
        if (gear == 4) {
            acceleration = gear + 4;
        }

    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setDeceleration(int gear) {
        if (gear == -4) {
            decceleration = gear + 4;
        }
        if (gear == -3) {
            decceleration = gear + 3;
        }
        if (gear == -2) {
            decceleration = gear + 2;
        }
        if (gear == -1) {
            decceleration = gear + 1;
        }
    }

    public int getDecceleration() {
        return decceleration;
    }

    public void setSpeedRange(int speedRange) {
        if (speedRange <= 20)
            gearRang = 1;
    }


    }






