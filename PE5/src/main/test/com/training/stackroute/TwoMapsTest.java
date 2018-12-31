package com.training.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoMapsTest {

    @Test
    public void replaceValuesOne() {
        TwoMaps twoMapsObj=new TwoMaps();
        Map<String,String> testObj=new HashMap<String, String>();
        testObj.put("val1","java");
        testObj.put("val2","c++");
        Map<String, String> expectedObj=new HashMap<String ,String>();
        expectedObj.put("val1","");
        expectedObj.put("val2","java");
        assertEquals(expectedObj,twoMapsObj.replaceValues(testObj));
    }

    @Test
    public void replaceValuesTwo() {
        TwoMaps twoMapsObj=new TwoMaps();
        Map<String,String> testObj=new HashMap<String, String>();
        testObj.put("val1","mars");
        testObj.put("val2","saturn");
        Map<String, String> expectedObj=new HashMap<String ,String>();
        expectedObj.put("val1","");
        expectedObj.put("val2","mars");
        assertEquals(expectedObj,twoMapsObj.replaceValues(testObj));
    }
}