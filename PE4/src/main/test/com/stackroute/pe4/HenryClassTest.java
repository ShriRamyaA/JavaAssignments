package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class HenryClassTest {

    @Test
    public void isTrueOne() {
        HenryClass henryClassObj=new HenryClass();
        assertEquals(false,henryClassObj.isTrue("This is Harry."));
    }
    @Test
    public void isTrueTwo() {
        HenryClass henryClassObj=new HenryClass();
        assertEquals(true,henryClassObj.isTrue("This is henry."));
    }
    @Test
    public void isTrueThree() {
        HenryClass henryClassObj=new HenryClass();
        assertEquals(true,henryClassObj.isTrue("This is Henry."));
    }
}