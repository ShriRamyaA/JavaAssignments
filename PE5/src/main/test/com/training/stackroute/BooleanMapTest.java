package com.training.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BooleanMapTest {

    @Test
    public void booleanCount() {
        BooleanMap booleanMapObj=new BooleanMap();
        Map<String,Boolean> expectedMap=new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        String[] testWords={"a","b","c","d","a","c","c"};

       assertEquals(expectedMap,booleanMapObj.booleanCount(testWords));
    }
}