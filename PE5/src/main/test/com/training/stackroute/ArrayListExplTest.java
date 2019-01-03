package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListExplTest {

    private ArrayListExpl arrayListExplObj;
    private ArrayList<String> expectedArray;

    @Before
    public void setUp(){
        arrayListExplObj=new ArrayListExpl();
        expectedArray=new ArrayList<>();
    }

    @Test
    public void replaceElementOne() {
        expectedArray.add("Kiwi");
        expectedArray.add("Grape");
        expectedArray.add("Mango");
        expectedArray.add("Berry");
        ArrayList<String> testArray=new ArrayList<>();
        testArray.add("Apple");
        testArray.add("Grape");
        testArray.add("Mango");
        testArray.add("Berry");

        assertEquals(expectedArray, arrayListExplObj.replaceElement(testArray,"Apple","Kiwi"));
    }

    @Test
    public void replaceElementTwo() {
        ArrayList<String> testArray=new ArrayList<>();
        assertEquals(expectedArray, arrayListExplObj.replaceElement(testArray,"Apple","Kiwi"));
        assertEquals(expectedArray, arrayListExplObj.replaceElement(testArray,"","Kiwi"));
    }

    @Test
    public void clearArray() {
        ArrayListExpl arrayListExplObj=new ArrayListExpl();
        ArrayList<String> expectedArray=new ArrayList<>();
        ArrayList<String> testArray=new ArrayList<>();
        testArray.add("Apple");
        testArray.add("Grape");
        testArray.add("Mango");
        testArray.add("Berry");
        assertEquals(expectedArray,arrayListExplObj.clearArray(testArray));
    }
}