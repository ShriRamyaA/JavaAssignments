package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    private ConsecutiveNumbers consecutiveNumbersObj;

    @Before
    public void beforeClass(){
        consecutiveNumbersObj=new ConsecutiveNumbers();
    }

    @Test
    public void checkConsecutiveNumbers1() {
        int data[]={1,2,3,4,5,6,7};
        assertEquals(true,consecutiveNumbersObj.checkConsecutiveNumbers(data));
    }

    @Test
    public void checkConsecutiveNumbers2() {
        int data[]={7,6,5,4,3,2,1};
        assertEquals(true,consecutiveNumbersObj.checkConsecutiveNumbers(data));
    }

    @Test
    public void checkConsecutiveNumbers3() {
        int data[]={1,2,3,3,5,6,7};
        assertEquals(false,consecutiveNumbersObj.checkConsecutiveNumbers(data));
    }
}