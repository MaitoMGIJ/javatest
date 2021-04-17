package com.mgij.javatest.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void return_fizz_when_the_number_is_divisible_by_3(){
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
    }

    @Test
    public void return_buzz_when_the_number_is_divisible_by_5(){
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
    }

    @Test
    public void return_fizzbuzz_when_the_number_is_divisible_by_3_and_5(){
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }

    @Test
    public void return_same_number_when_the_number_is_not_divisible_by_3_or_5(){
        assertEquals(String.valueOf(16), fizzBuzz.fizzBuzz(16));
    }

}