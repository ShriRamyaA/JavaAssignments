package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeekTest {

    @Test
    public void displayWeek() {
        Week weekObj=new Week();
        assertEquals("First day of the week :Mon 24/12/2018,Last day of the week :Sun 30/12/2018",weekObj.displayWeek());
    }
}