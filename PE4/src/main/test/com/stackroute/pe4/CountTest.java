package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTest {

    @Test
    public void countChar1() {
        Count countObj=new Count();
        assertEquals(5,countObj.countChar("Java is a nice language","a"));
    }

    @Test
    public void countChar2() {
        Count countObj=new Count();
        assertEquals(2,countObj.countChar("StackRoute is not a training center","o"));
    }
}