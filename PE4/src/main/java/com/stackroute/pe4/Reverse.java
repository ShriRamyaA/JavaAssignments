package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse {
    public String reverseString(String word){

        String[] wordArray=word.split(" ");
        StringBuilder finalWord=new StringBuilder();

        for (int i=0;i<wordArray.length;i++) {
            StringBuffer buff = new StringBuffer(wordArray[i]);
            finalWord.append(buff.reverse()+" ");
        }
        return finalWord.toString().trim();
    }
}
