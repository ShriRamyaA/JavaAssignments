package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sortTextOne() {
        Sort sortObj=new Sort();
        String[] expectedWords={"a","flexible","is","java","language","very"};
        assertEquals(expectedWords,sortObj.sortText("Java is a very flexible language"));
    }

    @Test
    public void sortTextTwo() {
        Sort sortObj=new Sort();
        String[] expectedWords={"on","sea","sea","sells","she","shells","shore","the"};
        assertEquals(expectedWords,sortObj.sortText("she sells sea shells on the sea shore"));
    }
}