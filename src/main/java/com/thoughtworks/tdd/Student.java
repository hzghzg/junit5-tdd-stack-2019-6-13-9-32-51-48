package com.thoughtworks.tdd;

public class Student {

    public static String number(int i) {
        if(i%3==0)
            return "Fizz";
        else if(i%5==0){
            return "Buzz";
        }
        else if(i%7==0){
            return "Whizz";
        }
        else
        return ""+i;
    }
}
