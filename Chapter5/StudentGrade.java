package Chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;


        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++);

        System.out.print("Enter Student Name 1: ");
        String name1 = input.nextLine();
        System.out.print("Enter student grade letter:");
        char grade1 = input.next().charAt(0);
        System.out.print("Enter Student Name 2: ");
        String name2 = input.nextLine();
        System.out.print("Enter Student grade letter:  ");
        char grade2 = input.next().charAt(0);

        System.out.print("Enter Student Name 3: ");
        String name3 = input.nextLine();
        System.out.print("Enter Student grade letter:  ");
        char grade3 = input.next().charAt(0);


        System.out.print("Enter Student Name 4: ");
        String name4 = input.nextLine();
        System.out.print("Enter Student grade letter:  ");
        char grade4 = input.next().charAt(0);

        System.out.print("Enter Student Name 5: ");
        String name5 = input.nextLine();
        System.out.print("Enter Student grade letter:  ");
        char grade5 = input.next().charAt(0);

        switch(grade1){
            case 5:
                ++aCount;
                break;
            case 4:
                ++bCount;
                break;
            case 3:
                ++cCount;
                break;

            case 2:
                ++dCount;



        }


    }




}


