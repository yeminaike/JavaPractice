package Chapter2exercises;

import java.util.Scanner;

public class Arithmetic1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter Integer 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter integer 3: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("The sum of the integers is %d%n ", sum);

        int avg = number1 + number2 + number3/3;
        System.out.printf("The average of the sum of the numbers is %d%n", avg);

        int product = number1 * number2 *number3;
        System.out.printf("The product of the numbers is %d%n", product);

        if(number1<number2 && number1<number3){
            System.out.print( "number1 is the smallest");

        } if (number2 < number3 && number2 < number1) {
            System.out.print("number2 is the smallest");



        }else {
            System.out.print("number3 is the smallest");
        }

            if( number1>number2  && number1 > number3) {
                System.out.print("number1 is the largest");
            }

                if(number2 > number3 && number2 > number1) {
                    System.out.print("number2 is the largest");

                } else{
                       System.out.print("number 3 is the largest");
                }
            }

        }






