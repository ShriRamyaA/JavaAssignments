package com.training.stackroute;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet extends TreeSet<String> {

    public ArrayList<String> sortWords(String toBeSorted) {

        ArrayList<String> sortedArrayList=new ArrayList<String>();

        TreeSet<String> sortedTreeSet=new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        if(toBeSorted==null){
            return null;
        }
        else if(toBeSorted.equals("")){
            return sortedArrayList;
        }else {
            String[] splitString = toBeSorted.split(" ");
            for (String eachWord : splitString) {
                sortedTreeSet.add(eachWord);
            }
            sortedArrayList.addAll(sortedTreeSet);
            return sortedArrayList;
        }
    }


}
