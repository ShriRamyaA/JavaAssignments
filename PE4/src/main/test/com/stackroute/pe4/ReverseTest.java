package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void reverseString() {
        Reverse reverseTestObj=new Reverse();
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",reverseTestObj.reverseString("a quick brown fox jumps over the lazy dog"));
    }
}