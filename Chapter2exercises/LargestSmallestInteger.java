package Chapter2exercises;

import java.util.Scanner;

public class LargestSmallestInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter integer1");
        int number1 = input.nextInt();

        System.out.println("Enter integer 2");
        int number2 = input.nextInt();



        System.out.println("Enter integer 3");
        int number3 = input.nextInt();

        System.out.println("Enter integer 4");
        int number4 = input.nextInt();

        System.out.println("Enter integer 5");
        int number5 = input.nextInt();

        int smallest;

        smallest = number1;

        if (number2 < smallest)
            smallest = number2;

        if (number3 < smallest)
            smallest = number3;

        if (number4 < smallest)
            smallest = number4;

        if (number5 < smallest)
            smallest = number5;

        int largest;

        largest = number1;

        if (number2 > largest)
            largest = number2;

        if (number3 > largest)
            largest = number3;

        if (number4 < largest)
            largest = number4;

        if (number5 > largest)
            largest = number5;

        if ( number2 > largest ){
            largest = number2;
            System.out.printf ( "Largest of five values is %d, and the smallest is %d%n", largest, smallest );
        }
        else if ( number3 > largest ){
            largest = number3;
            System.out.printf ( "Largest of five values is %d, and the smallest is %d%n", largest, smallest );
        }
        else if ( number4 > largest ){
            largest = number4;
            System.out.printf ( "Largest of five values is %d, and the smallest is %d%n", largest, smallest );
        }
        else if (number5 > largest){
            largest = number5;
            System.out.printf ( "Largest of five values is %d, and the smallest is %d%n", largest, smallest );
        }



        }


    }

