package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceTest {

    @Test
    public void findOccurance() {
        Occurance occuranceObj=new Occurance();
        assertEquals("found:1:4-6 found:2:10-12 found:3:27-29",occuranceObj.findOccurance("She sells seashells by the seashore","se"));
    }
}