package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowellessTest {

    @Test
    public void eliminateVowels() {
        Vowelless vowellessObj=new Vowelless();
        assertEquals("asa",vowellessObj.eliminateVowels());
    }
}