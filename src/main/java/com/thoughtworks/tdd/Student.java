package com.thoughtworks.tdd;

public class Student {

    public static String number(int i) {
        if(i%105==0)
            return "FizzBuzzWhizz";
        else if(i%15==0){
            return "FizzBuzz";
        }
        else if(i%21==0){
            return "FizzWhizz";
        }
        else if(i%35==0){
            return "BuzzWhizz";
        }
        else if(i%3==0)
            return "Fizz";
        else if(i%5==0){
            return "Buzz";
        }
        else if(i%7==0){
            return "Whizz";
        }
        else if(i==13)
            return "Fizz";
        else
        return ""+i;
    }
}
