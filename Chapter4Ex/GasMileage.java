package Chapter4Ex;

import java.util.Scanner;

public class GasMileage {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallons;
        int totalMiles = 0;
        int counter = 1;
        int totalGallons = 0;
        int result = 0;
        System.out.print("Enter the miles: ");
         miles = input.nextInt();
        System.out.print("Enter the gallon: ");
         gallons = input.nextInt();
        while (result != -1) {
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;
            System.out.printf("Miles per gallon for trip %d = %.2f%n", counter, (double) miles / gallons);
            System.out.print("Enter the miles: ");
             miles = input.nextInt();
            System.out.print("Enter the gallon: ");
             gallons = input.nextInt();
             //counter = counter + 1 is the same as counter++;
            counter++;
            System.out.printf("Enter -1 to quit%n");
            result = input.nextInt();
            if (result == -1) {

                double average = (double) totalMiles / totalGallons;
                System.out.printf("Combine miles per gallon for all trips = %.2f%n",average );
            }
        }
    }
}





