package com.stackroute.pe4;

public class Count {

    public int countChar(String word, String replace){
        int charcount = word.length() - word.replaceAll(replace, "").length();
        return charcount;
    }
}
