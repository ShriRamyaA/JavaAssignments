package com.training.stackroute;

import java.util.Map;

public class TwoMaps {

    public Map<String,String> replaceValues(Map<String,String> checkMap){

        if(checkMap.get("val1").equals("")){
            return checkMap;
        }else{
            checkMap.put("val2",checkMap.get("val1"));
            checkMap.put("val1","");
            return checkMap;
        }

    }
}
