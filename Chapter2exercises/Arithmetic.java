package Chapter2exercises;

public class Arithmetic {
    public double squareFirstNumber(double num1) {
        return num1 * num1;
    }

    public double squareSecondNumber(double num2) {
        return num2 * num2;
    }

    public double sumSquareOfFirstNumberAndSecondNumber(double num1, double num2) {
        return (num1 * num1) + (num2 * num2);

    }

    public double DifferencesOfTheSquareOfFirstNumberAndSecondNumber(double num1, double num2) {

        return (num1 * num1) - (num2 * num2);

        // double Difference= (num1 *num1)+ (num2 * num2);
        // return Difference;


    }

    public int inputOneInteger(int num1) {
        return num1;
    }

    public double squareOfInteger(int num1) {
        return Math.pow(2, 2);
    }

    public boolean whenSquareIsGreaterThan100(int num1) {
        if (Math.pow(2, 2) > 100) {
            System.out.print("True");
        } else {
            System.out.println("false");
        }
        return true;


    }

    public boolean whenSquareIsEqualTo100(int num1) {
        if (num1 == 100) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        return false;
    }

    public boolean whenSquareIsNotEqualTo100(int num1) {
        if (num1 != 100) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
        return true;
    }

    public boolean whenSquareIsLessThan100(int num1) {
        if (num1 < 100) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
        return true;
    }

    public int sumOfTheThreeIntegers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int averageOfTheThreeIntegers(int num1, int num2, int num3) {
        return num1 + num2 + num3 / 3;
    }

    public int productOfTheThreeIntegers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int smallestOfTheThreeIntegers(int num1, int num2, int num3) {
        if (num1 < num2) {
            System.out.println("The smallest is num1");

        } else {
            System.out.println("The smallest is num2");
        }
        if (num1 < num3) {
            System.out.print("The smallest is num1");

        } else {
            System.out.print("The smallest is num3");
        }
        return num1;
    }

    public int largestOfTheThreeIntegers(int num1, int num2, int num3) {
        if (num3 > num1) {
            System.out.println("The Largest number num3");
        }

        if (num3 > num2) {
            System.out.println("The largest number is num3");
        }

        return num3;
    }
}




