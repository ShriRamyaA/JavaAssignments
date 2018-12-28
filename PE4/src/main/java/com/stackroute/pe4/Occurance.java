package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurance {
    public String findOccurance(String text, String patternString){

        StringBuilder finalOutput=new StringBuilder();
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            finalOutput.append("found:" + count + ":"
                    + matcher.start() + "-" + matcher.end()+" ");
        }
        return finalOutput.toString().trim();
    }
}
