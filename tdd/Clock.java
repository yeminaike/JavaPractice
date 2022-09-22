package tdd;

public class Clock {


    private int hour;
    private int minute;
    private int second;

    private int DisplayTime;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour > 23)
            this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (hour >= 59)

            this.minute = minute;
    }

    public int getMinute() {
        return minute;

    }

    public void setSecond(int second) {
        if (second >= 59)

            this.second = second;

    }

    public int getSecond() {

        return second;
    }

    public int getDisplayTime() {
        return DisplayTime;
    }


}






