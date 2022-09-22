import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int number ;
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the number");
        number = input.nextInt();

        if (number > 0){

        }
        else if ( number >= 1)
            System.out.printf("%d! = %d", number, factorial);
        else{
            for(int counter = number; counter >= 4; counter++) {
                factorial = factorial * counter;
            }
        }


    }
}
