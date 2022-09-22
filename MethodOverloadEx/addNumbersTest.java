package MethodOverloadEx;

public class addNumbersTest {

    public static void main(String[] args) {
        addNumbers myAddition = new addNumbers();

        System.out.println(myAddition.addTwoNumbers(3, 4));

        System.out.printf("The result of my addition is %d", myAddition.addTwoNumbers(3, 4));
        System.out.printf("The result of my addition is %d", myAddition.addTwoNumbers(1,2));




    }
}
