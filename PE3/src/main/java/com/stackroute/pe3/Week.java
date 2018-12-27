package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Week {

    public String displayWeek(){

        StringBuilder output=new StringBuilder();

        Calendar c = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        output.append("First day of the week :"+df.format(c.getTime())+",");
        System.out.println("First day of the week :"+df.format(c.getTime()));

        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        c.add(Calendar.DATE, 7);
        output.append("Last day of the week :"+df.format(c.getTime()));
        System.out.println("Last day of the week :"+df.format(c.getTime()));

        return output.toString();

    }
}
