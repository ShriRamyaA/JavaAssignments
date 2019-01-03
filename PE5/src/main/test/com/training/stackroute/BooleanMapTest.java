package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BooleanMapTest {

    private BooleanMap booleanMapObj;
    private Map<String, Boolean> expectedMap;

    @Before
    public void setUp(){
        booleanMapObj=new BooleanMap();
        expectedMap=new HashMap<String, Boolean>();
    }

    @Test
    public void booleanCount() {
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        String[] testWords={"a","b","c","d","a","c","c"};
       assertEquals(expectedMap,booleanMapObj.booleanCount(testWords));
    }
}