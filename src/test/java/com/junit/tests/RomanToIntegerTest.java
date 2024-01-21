package com.junit.tests;

import com.java.leetcode.RomanToInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    public void testromanToInt(){
        String roman = "VII";
        int expectedVal = 7;
        Assertions.assertEquals(expectedVal, RomanToInteger.romanToInt(roman));
    }
}
