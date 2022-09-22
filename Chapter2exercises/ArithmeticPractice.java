package Chapter2exercises;

import java.util.Scanner;

public class ArithmeticPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer1");
        int num1 = input.nextInt();

        System.out.print("Enter Integer2");
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        System.out.printf("The square of Integer1 is %d%n", square1);

        System.out.printf("The square of the second integer %d%n", square2);

        int sum = square1 + square2;

        System.out.printf(" The sum of their squares is %d%n", sum);

        int difference = square1 - square2;

        System.out.printf(" the difference of their square is %d%n", difference);


    }



}









