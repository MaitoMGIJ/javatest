package com.mgij.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        double result = 0;
        for (Double price : prices) {
            result+=price;
        }

        return Math.round((result * (1 - (discount / 100)))*100)/100D;
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
