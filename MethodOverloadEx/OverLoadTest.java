package MethodOverloadEx;

public class OverLoadTest {

    public static void main(String[] args) {
        OverLoad overload = new OverLoad();
        overload.buyPizza("Domino's", 1000);
        System.out.printf("I bought the Pizza in %s at %d",overload.buyPizza());
        System.out.println(overload.buyPizza("Domino's"));
        System.out.println(overload.buyPizza());




    }
}
