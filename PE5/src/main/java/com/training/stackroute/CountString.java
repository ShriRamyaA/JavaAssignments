package com.training.stackroute;

import java.util.HashMap;
import java.util.Map;

public class CountString {

    public Map<String, Integer> findCount(String sentence){

        String[] words=sentence.split("[^a-zA-Z]+");
        Map<String, Integer> mapCount= new HashMap<String ,Integer>();
        for(String w : words) {
            Integer i = mapCount.get(w);
            if(i == null) mapCount.put(w, 1);
            else mapCount.put(w, i + 1);
        }

        return mapCount;

    }
}
