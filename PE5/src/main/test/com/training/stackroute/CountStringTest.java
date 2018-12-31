package com.training.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountStringTest {

    @Test
    public void findCount() {
        CountString countStringObj=new CountString();
        Map<String, Integer> expectedMapCount= new HashMap<String ,Integer>();
        expectedMapCount.put("one",5);
        expectedMapCount.put("two",2);
        expectedMapCount.put("three",2);
        assertEquals(expectedMapCount,countStringObj.findCount("one one -one___two,,three,one @three*one?two"));
    }
}