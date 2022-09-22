package Chapter2exercises;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer1");
        int number1 = input.nextInt();

        System.out.println("Enter integer 2");
        int number2 = input.nextInt();

        if (number1 * 3 % number2 * 2 == 0) {

            System.out.printf("%d tripled is a multiple of %d%n doubled", number1, number2);
        }
      else{
          System.out.print("It is not a tripled of the second number");
        }


    }
}