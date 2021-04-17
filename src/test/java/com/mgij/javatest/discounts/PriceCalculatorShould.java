package com.mgij.javatest.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    private PriceCalculator calculator;

    @Before
    public void setup(){
        calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_prices() {
        assertEquals(0, calculator.getTotal(), 0);
    }

    @Test
    public void total_is_the_sum_of_prices(){
        calculator.addPrice(10);
        calculator.addPrice(15.5);

        assertEquals(25.5, calculator.getTotal(), 0);
    }

    @Test
    public void apply_discount_to_prices(){
        calculator.addPrice(24.8);
        calculator.addPrice(35.4);

        calculator.setDiscount(25);

        assertEquals(45.15, calculator.getTotal(), 0);
    }
}