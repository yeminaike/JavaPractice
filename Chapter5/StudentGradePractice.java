package Chapter5;

import java.util.Scanner;

public class StudentGradePractice {


    public static int aCount = 0;
    public static int bCount = 0;
    public static int cCount = 0;
    public static int dCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name1 = input.nextLine();
        System.out.print("Enter grade: ");
        String grade1 = input.nextLine();

        System.out.print("Enter name: ");
        String name2 = input.nextLine();
        System.out.print("Enter grade: ");
        String grade2 = input.nextLine();

        System.out.print("Enter name: ");
        String name3 = input.nextLine();
        System.out.print("Enter grade: ");
        String grade3 = input.nextLine();

        System.out.print("Enter name: ");
        String name4 = input.nextLine();
        System.out.print("Enter grade: ");
        String grade4 = input.nextLine();

        System.out.print("Enter name: ");
        String name5 = input.nextLine();
        System.out.print("Enter grade: ");
        String grade5 = input.nextLine();

        gradeCounter(grade1);
        gradeCounter(grade2);
        gradeCounter(grade3);
        gradeCounter(grade4);
        gradeCounter(grade5);

        System.out.printf("%s%20s%n", "Grade", "No of student");
        System.out.printf("%5s%20d%n", "A", aCounter());
        System.out.printf("%5s%20d%n", "B", bCounter());
        System.out.printf("%5s%20d%n", "C", cCounter());
        System.out.printf("%5s%20d%n", "E", dCounter());


    }


    public static void gradeCounter(String letter) {

        switch (letter) {
            case ("A") -> ++aCount;
            case ("B") -> ++bCount;
            case ("C") -> ++cCount;
            default -> ++dCount;
        }
    }

    public static int aCounter() {
        return aCount;
    }

    public static int bCounter() {
        return bCount;
    }

    public static int cCounter() {
        return cCount;
    }

    public static int dCounter() {
        return dCount;
    }
}
