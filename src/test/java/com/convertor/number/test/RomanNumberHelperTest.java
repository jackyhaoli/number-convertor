package com.convertor.number.test;

import com.convertor.number.RomanNumberHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberHelperTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLatinToRomanNumber_1() throws Exception {
        int latinNum = 9;
        String roman = RomanNumberHelper.latinToRomanNumber(latinNum);
        assertEquals(roman, "IX");
    }

    @Test
    public void testLatinToRomanNumber_2() throws Exception {
        int latinNum = 369;
        String roman = RomanNumberHelper.latinToRomanNumber(latinNum);
        assertEquals(roman, "CCCLXIX");
    }

    @Test
    public void testLatinToRomanNumber_withException() throws Exception {
        int latinNum = 7000;
        try {
            String roman = RomanNumberHelper.latinToRomanNumber(latinNum);
        }catch (Exception e){
            String msg = e.getMessage();
            assertEquals(true, msg.contains("input latin number error"));
        }
    }
}