package Chapter4Ex;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber = 0;
        int balance = 0;
        int charges = 0;
        int credits = 0;
        int creditLimit = 0;

        System.out.println("Enter account number");
        accountNumber = input.nextInt();

        System.out.println("Enter at the Beginning of the month");
        balance = input.nextInt();

        System.out.println("Enter total Of All Items Charged");
        charges = input.nextInt();

        System.out.println("Enter total of all Credits Applied");
        credits = input.nextInt();

        System.out.println("Enter allowed Credit Limit");
        creditLimit = input.nextInt();

        int newBalance = balance + charges - credits;

        if (newBalance <= creditLimit) {
            System.out.println("It did not exceed credit limit");
        } else {
            System.out.println("Credit limited exceeded");

        }
    }
}


