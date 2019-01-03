package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayListExplTest {

    private ArrayListExpl arrayListExplObj;
    private ArrayList<String> expectedArray;
    private ArrayList<String> testArray;

    @Before
    public void setUp(){
        arrayListExplObj=new ArrayListExpl();
        expectedArray=new ArrayList<String>();
        testArray=new ArrayList<String>();
    }

    @Test
    public void replaceElementOne() {
        expectedArray= new ArrayList<String>(Arrays.asList(new String[]{"Kiwi", "Grape", "Mango","Berry"}));
        testArray= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Mango","Berry"}));


        assertEquals(expectedArray, arrayListExplObj.replaceElement(testArray,"Apple","Kiwi"));
    }

    @Test
    public void replaceElementTwo() {
        assertEquals(expectedArray, arrayListExplObj.replaceElement(testArray,"Apple","Kiwi"));
        assertEquals(expectedArray, arrayListExplObj.replaceElement(testArray,"","Kiwi"));
    }

    @Test
    public void clearArray() {
        testArray= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Mango","Berry"}));
        assertEquals(expectedArray,arrayListExplObj.clearArray(testArray));
    }
}