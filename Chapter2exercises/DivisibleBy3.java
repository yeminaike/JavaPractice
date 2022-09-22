package Chapter2exercises;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Integer1");
        int number = input.nextInt();

        if(number % 3 == 0){
            System.out.println("Given that number is divisible by 3");
        }
        else{
            System.out.println("Given that number is not divisible by 3");
        }


    }
}
