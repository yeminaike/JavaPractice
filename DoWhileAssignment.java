import java.util.Scanner;

public class DoWhileAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Enter First number: ");
            int num1 = input.nextInt();
            System.out.println("Enter Second number: ");
            int num2 = input.nextInt();
            System.out.println(num1 + num2);


            System.out.println("\nPress 1 to continue");
            int answer = input.nextInt();
            if (answer == 1) {
                i++;
            } else break;
        }
        while (i > 0);
    }
}







