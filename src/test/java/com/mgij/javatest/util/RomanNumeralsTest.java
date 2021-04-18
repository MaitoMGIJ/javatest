package com.mgij.javatest.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setup(){
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void return_I_when_the_number_is_1(){
        assertEquals("I", romanNumerals.arabicToRoman(1));
    }

    @Test
    public void return_II_when_the_number_is_2(){
        assertEquals("II", romanNumerals.arabicToRoman(2));
    }

    @Test
    public void return_III_when_the_number_is_3(){
        assertEquals("III", romanNumerals.arabicToRoman(3));
    }

    @Test
    public void return_V_when_the_number_is_5(){
        assertEquals("V", romanNumerals.arabicToRoman(5));
    }

    @Test
    public void return_VI_when_the_number_is_6(){
        assertEquals("VI", romanNumerals.arabicToRoman(6));
    }

    @Test
    public void return_VII_when_the_number_is_7(){
        assertEquals("VII", romanNumerals.arabicToRoman(7));
    }

    @Test
    public void return_X_when_the_number_is_10(){
        assertEquals("X", romanNumerals.arabicToRoman(10));
    }

    @Test
    public void return_XI_when_the_number_is_11(){
        assertEquals("XI", romanNumerals.arabicToRoman(11));
    }

    @Test
    public void return_XV_when_the_number_is_15(){
        assertEquals("XV", romanNumerals.arabicToRoman(15));
    }

    @Test
    public void return_XVI_when_the_number_is_16(){
        assertEquals("XVI", romanNumerals.arabicToRoman(16));
    }

    @Test
    public void return_L_when_the_number_is_50(){
        assertEquals("L", romanNumerals.arabicToRoman(50));
    }

    @Test
    public void return_LI_when_the_number_is_51(){
        assertEquals("LI", romanNumerals.arabicToRoman(51));
    }

    @Test
    public void return_LV_when_the_number_is_55(){
        assertEquals("LV", romanNumerals.arabicToRoman(55));
    }

    @Test
    public void return_LVI_when_the_number_is_56(){
        assertEquals("LVI", romanNumerals.arabicToRoman(56));
    }

    @Test
    public void return_LX_when_the_number_is_60(){
        assertEquals("LX", romanNumerals.arabicToRoman(60));
    }

    @Test
    public void return_LXX_when_the_number_is_70(){
        assertEquals("LXX", romanNumerals.arabicToRoman(70));
    }

    @Test
    public void return_LXXX_when_the_number_is_15(){
        assertEquals("LXXX", romanNumerals.arabicToRoman(80));
    }

    @Test
    public void return_LXXXI_when_the_number_is_81(){
        assertEquals("LXXXI", romanNumerals.arabicToRoman(81));
    }

    @Test
    public void return_LXXXV_when_the_number_is_85(){
        assertEquals("LXXXV", romanNumerals.arabicToRoman(85));
    }

    @Test
    public void return_LXXXVI_when_the_number_is_86(){
        assertEquals("LXXXVI", romanNumerals.arabicToRoman(86));
    }

    @Test
    public void return_CXXVI_when_the_number_is_126(){
        assertEquals("CXXVI", romanNumerals.arabicToRoman(126));
    }

    @Test
    public void return_MMDVII_when_the_number_is_2507(){
        assertEquals("MMDVII", romanNumerals.arabicToRoman(2507));
    }

    @Test
    public void return_CD_when_the_number_is_400(){
        assertEquals("CD", romanNumerals.arabicToRoman(400));
    }

    @Test
    public void return_XCIX_when_the_number_is_99(){
        assertEquals("XCIX", romanNumerals.arabicToRoman(99));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void return_exception_when_number_is_mayor_that_10000(){
        romanNumerals.arabicToRoman(10000);
    }
}