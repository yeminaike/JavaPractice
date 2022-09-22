import java.util.Scanner;

public class Asterisk {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1-30");
        int number = input.nextInt();
        for (int i = 1; i <= number; i +=1 ){
            if(number<=35)
                System.out.print("*");
        }
    }
}
