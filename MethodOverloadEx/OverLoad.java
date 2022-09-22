package MethodOverloadEx;

public class OverLoad {
    public String buyPizza (String where){
        return "I bought pizza at " + where;
    }
    public String buyPizza(){
        return "I bought pizza at just a random place!";
    }

    public void buyPizza(String where, int price){

        System.out.printf("I bought pizza at %s for %d", where, price);
    }






    }


