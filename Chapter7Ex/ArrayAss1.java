package Chapter7Ex;

public class ArrayAss1 {

    public static void main(String[] args) {
        int sum = 0;

        int[] numbers = new int[7];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;

        for (int index = 0; index < numbers.length; index++) {

            sum = sum + numbers[index];

            System.out.printf("%s%n", numbers[index]);

        }
        System.out.printf("Total of array elements: %d%n", sum);

    }
}
// psuedocode
// initialize the sum to zero
// create a new array of numbers of type int.
// assign the variables to number.
//Create a for loop by initializing the index to zero, loop continuation condition of numbers.length and the increment
// and the increment of values.
// display the sum of the result

