package tdd.airConditioner;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public void setOn(boolean value) {
        isOn = value;

    }

    public boolean getAirConditionerisOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature < 25) {
            temperature = temperature + 1;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 10) {
            temperature = temperature - 1;
        }

    }

}

