package Chapter3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HealthProfile myHealthProfile = new HealthProfile ("Ade","Og","male", 3,5,1993,35.7,50.0);


        System.out.print("Enter the First Name of the patient");
                String firstName = input.nextLine();
                myHealthProfile.setFirstName(firstName);

                System.out.print("Enter the last name");
                String lastName = input.nextLine();
                myHealthProfile.setLastName(lastName);

                System.out.print("The gender of the patient");
                String gender = input.nextLine();
                myHealthProfile.setGender(gender);


        System.out.print("Enter date of birth(month, day and year) separated by space: ");
        int month = input.nextInt();
        myHealthProfile.setMonthOfBirth(month);

        int day = input.nextInt();
        myHealthProfile.setDayOfBirth(day);

        int year = input.nextInt();
        myHealthProfile.setYearOfBirth(year);

        myHealthProfile.getAge();
        myHealthProfile.getMaximumHeartRate();
        myHealthProfile.getTargetHeartRate1();
        myHealthProfile.getTargetHeartRate2();

        System.out.printf("%nFirst name: %s%n",myHealthProfile.getFirstName());
        System.out.printf("%nLast name : %s%n", myHealthProfile.getLastName());
        System.out.printf("Date of birth: %d|%d|%d%n",myHealthProfile.getMonthOfBirth(), myHealthProfile.getDayOfBirth(),
                myHealthProfile.getYearOfBirth());
        System.out.printf("Age : %d years%n",myHealthProfile.getAge());
        System.out.printf("Maximum heart rate in beats per minute : %.2f%n", myHealthProfile.getMaximumHeartRate());
        System.out.printf("Target heart rate range in beats per minute: %.2f - %.2f%n", myHealthProfile.getTargetHeartRate1(),
                myHealthProfile.getTargetHeartRate2());
  System.out.printf("The height is: %.1f%n", myHealthProfile.getHeight());
System.out.printf("The weight is: %.1f%n", myHealthProfile.getWeight());
}
   }