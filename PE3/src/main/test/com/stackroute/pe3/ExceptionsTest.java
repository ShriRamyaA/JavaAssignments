package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {
    Exceptions exceptionsObj;

    @Before
    public void beforeClass(){
        exceptionsObj=new Exceptions();
    }

    @Test
    public void createNegativeArraySizeException() {
        assertEquals(true,exceptionsObj.createNegativeArraySizeException());
    }

    @Test
    public void createIndexOutOfBoundException() {
        assertEquals(true,exceptionsObj.createIndexOutOfBoundException());
    }

    @Test
    public void createNullPointerException() {
        assertEquals(true,exceptionsObj.createNullPointerException());
    }
}