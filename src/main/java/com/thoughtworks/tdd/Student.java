package com.thoughtworks.tdd;

public class Student {

    public static String number(int i) {
        if(i%3==0)
            return "Fizz";
        else if(i%5==0){
            return "Buzz";
        }
        else
        return ""+i;
    }
}
