package com.mgij.javatest.util;

public class RomanNumerals {
    public String convertDigitArabicToRoman(int digit, String symbol, String symbolMedium, String symbolNext){
        String roman = "";
        if(digit == 9){
            roman += symbol + symbolNext;
        }else if(digit >= 5){
            roman += symbolMedium;
            for (int i = 5; i < digit; i++) {
                roman += symbol;
            }
        }else if(digit == 4){
            roman += symbol + symbolMedium;
        }else{
            for (int i = 0; i < digit; i++) {
                roman += symbol;
            }
        }
        return roman;
    }

    public String convertDigitArabicToRoman(int digit, String symbol){
        String roman = "";
        for (int i = 0; i < digit; i++) {
            roman += symbol;
        }
        return roman;
    }

    public String arabicToRoman(int number){
        if(number > 9999){
            throw new UnsupportedOperationException("Please, You use only number minors that 10000");
        }

        String roman = "";

        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = (number % 10);

        roman += convertDigitArabicToRoman(thousands, "M");
        roman += convertDigitArabicToRoman(hundreds, "C", "D", "M");
        roman += convertDigitArabicToRoman(tens, "X", "L", "C");
        roman += convertDigitArabicToRoman(units, "I", "V", "X");

        return roman;
    }
}
