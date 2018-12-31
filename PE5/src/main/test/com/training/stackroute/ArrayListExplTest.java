package com.training.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListExplTest {

    @Test
    public void replaceElement() {
        ArrayListExpl arrayListExplObj=new ArrayListExpl();
        ArrayList<String> expectedArray=new ArrayList<>();
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