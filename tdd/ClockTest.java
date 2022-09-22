package tdd;

public class ClockTest {
    public static void main(String[] args){

        Clock myClock = new Clock(24, 70, 100);
        System.out.printf("The hour displays:  %d%n",  myClock.getHour());
        System.out.printf("The minute displays: %d%n", myClock.getMinute());
        System.out.printf("The second displays: %d%n", myClock.getSecond());


        System.out.println();
        System.out. printf("The display time is: %d:%d:%d", myClock.getHour(), myClock.getMinute(), myClock.getSecond());

    }




}
