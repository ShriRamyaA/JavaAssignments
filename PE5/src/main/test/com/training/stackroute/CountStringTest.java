package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountStringTest {

    private CountString countStringObj;
    private Map<String, Integer> expectedMapCount;

    @Before
    public void setUp(){
        countStringObj=new CountString();
        expectedMapCount= new HashMap<String ,Integer>();
    }

    @Test
    public void findCount() {
        expectedMapCount.put("one",5);
        expectedMapCount.put("two",2);
        expectedMapCount.put("three",2);
        assertEquals(expectedMapCount,countStringObj.findCount("one one -one___two,,three,one @three*one?two"));
    }
}