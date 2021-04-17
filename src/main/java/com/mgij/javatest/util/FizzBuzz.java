package com.mgij.javatest.util;

public class FizzBuzz {

    public String fizzBuzz(int number) {

        String result = "";

        if(number % 3 == 0){
            result+="Fizz";
        }

        if(number % 5 == 0){
            result+="Buzz";
        }
        return result != "" ? result : String.valueOf(number);
    }
}
