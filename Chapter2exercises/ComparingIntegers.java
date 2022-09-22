package Chapter2exercises;

import java.util.Scanner;

public class ComparingIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1");
        int number = input.nextInt();


        int square = number * number;
        System.out.printf("The square of number is %d%n", square);

        if (square > 100) {
            System.out.printf("%d > %d%n", square, 100);
        }
        if (square < 100) {
            System.out.printf("%d < %d%n", square, 100);
        }
        if (square != 100) {
            System.out.printf("%d != %d%n", square, 100);
        }
        if (square == 100) {
            System.out.printf("%d == %d%n", square, 100);
        }
    }
}






