package com.training.stackroute;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExpl {

    public ArrayList<String> replaceElement(ArrayList<String> checkArrayList, String replace, String replacedBy){

        for (int i = 0; i < checkArrayList.size(); i++)
        {
            if (checkArrayList.get(i).equals(replace)){
                checkArrayList.set(i,replacedBy);
            }
        }
            return checkArrayList;

        }


    public ArrayList<String> clearArray(ArrayList<String> arrayList){

        arrayList.clear();
        return arrayList;

        }

    }


