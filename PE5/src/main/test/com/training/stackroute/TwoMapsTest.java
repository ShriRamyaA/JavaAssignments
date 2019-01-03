package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoMapsTest {

    private TwoMaps twoMapsObj;
    private Map<String, String> testObj;
    private Map<String, String> expectedObj;

    @Before
    public void setUp(){
       twoMapsObj=new TwoMaps();
       testObj=new HashMap<String, String>();
        expectedObj=new HashMap<String ,String>();

    }

    @Test
    public void replaceValuesOne() {
        testObj.put("val1","java");
        testObj.put("val2","c++");
        expectedObj.put("val1","");
        expectedObj.put("val2","java");
        assertEquals(expectedObj,twoMapsObj.replaceValues(testObj));
    }

    @Test
    public void replaceValuesTwo() {
        testObj.put("val1","");
        testObj.put("val2","saturn");
        assertEquals(testObj,twoMapsObj.replaceValues(testObj));
    }

    @Test
    public void replaceValuesThree() {
        testObj.put("val1","");
        testObj.put("val2","saturn");
        expectedObj.put("val1","");
        expectedObj.put("val2","");
        assertNotEquals(expectedObj,twoMapsObj.replaceValues(testObj));
    }
}