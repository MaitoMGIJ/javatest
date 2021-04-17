package com.mgij.javatest.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiples_times() {
        assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }

    @Test
    public void string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("string_not_empty"));
    }

    @Test
    public void string_empty_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_with_spaces_is_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }

}