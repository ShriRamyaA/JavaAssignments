package com.training.stackroute;

import java.util.HashMap;
import java.util.Map;

public class BooleanMap {

    public Map<String, Integer> findCount(String[] words){

        Map<String, Integer> mapCount= new HashMap<String ,Integer>();
        for(String w : words) {
            Integer i = mapCount.get(w);
            if(i == null) mapCount.put(w, 1);
            else mapCount.put(w, i + 1);
        }
        return mapCount;
    }

    public Map<String,Boolean> booleanCount(String[] words){

        Map<String,Integer> firstMap=findCount(words);
        Map<String,Boolean> resultMap=new HashMap<String, Boolean>();

        for (Map.Entry<String, Integer> entry : firstMap.entrySet())
        {
            if (entry.getValue()>1){
                resultMap.put(entry.getKey(),true);
            }
            else{
                resultMap.put(entry.getKey(),false);
            }
        }
        return resultMap;
    }
}
