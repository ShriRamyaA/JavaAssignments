package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedSetTest {

    private SortedSet sortedSetObj;
    private ArrayList<String> expectedArray;

    @Before
    public void setUp(){
        sortedSetObj=new SortedSet();
        expectedArray=new ArrayList<String>();
    }

    @Test
    public void sortWordsOne() {
        expectedArray.add("Alice");
        expectedArray.add("Bluto");
        expectedArray.add("Eugene");
        expectedArray.add("Harry");
        expectedArray.add("Olive");
        assertEquals(expectedArray,sortedSetObj.sortWords("Harry Olive Alice Bluto Eugene"));
    }

    @Test
    public void sortWordsTwo() {
        String input=null;
        expectedArray.add("Harry");
        assertEquals(expectedArray,sortedSetObj.sortWords("Harry"));
        expectedArray.clear();
        assertEquals(expectedArray,sortedSetObj.sortWords(""));
        assertNull(sortedSetObj.sortWords(input));
    }
}