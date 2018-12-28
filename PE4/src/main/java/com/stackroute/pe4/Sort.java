package com.stackroute.pe4;

import java.util.Arrays;

public class Sort {

    public String[] sortText(String word){
        String[] arrayWords=word.toLowerCase().split(" ");
        Arrays.sort(arrayWords);
        return arrayWords;
    }
}
