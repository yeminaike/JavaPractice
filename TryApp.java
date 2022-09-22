import java.security.SecureRandom;
import java.util.Scanner;

public class TryApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom myRandomNumber = new SecureRandom();
        int value = 1 + myRandomNumber.nextInt(10);
        int count = 0;


        while (count != value){
            System.out.println("Guess the digit: ");
            int number = input.nextInt();

            if(value < number){
                System.out.println("too high");

            } else if (value > number){
                System.out.println("too low");
            } else {
                System.out.println("You won!!!!!!!! Congratulations!!!!!!!!");
            }
        }
    }
}
