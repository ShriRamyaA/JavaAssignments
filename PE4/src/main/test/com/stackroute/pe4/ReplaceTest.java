package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

    @Test
    public void replaceCharOne() {
        Replace replaceObj=new Replace();
        assertEquals("faity fry",replaceObj.replaceChar("daily dry"));
    }
    @Test
    public void replaceCharTwo() {
        Replace replaceObj=new Replace();
        assertEquals("Dataitama",replaceObj.replaceChar("Dalailama"));
    }
}