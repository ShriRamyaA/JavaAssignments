package com.training.stackroute;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedSetTest {

    @Test
    public void sortWords() {

        SortedSet sortedSetObj=new SortedSet();
        ArrayList<String> expectedArray=new ArrayList<String>();
        expectedArray.add("Alice");
        expectedArray.add("Bluto");
        expectedArray.add("Eugene");
        expectedArray.add("Harry");
        expectedArray.add("Olive");
        assertEquals(expectedArray,sortedSetObj.sortWords("Harry Olive Alice Bluto Eugene"));
    }
}