package MethodOverloadEx;

public class addNumbers {

    public int addTwoNumbers(int num1, int num2){
        return num1 + num2;

    }

    public double addTwoNumbers(int num3, double num4){
        return num3 + num4;

    }

    public double addTwoNumbers(double num3, double num4){
        return num3 + num4;
    }

    public double addTwoNumbers(double num3, int num4){
        return num3 + num4;
    }



}
