package Chapter2exercises;

public class Loop {
    public static void main(String[] args) {
        int count = 1;
        int counter = 1;


        for (count = 1; count <= 9; count++) {
            System.out.print("*");
        }
        System.out.println();
        for (counter = 1; counter < 9 ; counter++) {
            System.out.printf("%s%8s%n", "*", "*");
        }
        for (count = 1; count <= 9; count++) {
            System.out.print("*");
        }




    }
}
