package com.stackroute.unittest;

import java.io.File;
import java.io.FileReader;

public class ReadContent {

    public static void main(String []args){
        File file = new File("dummy.txt");
        StringBuilder output=new StringBuilder();
        try{
            FileReader fr = new FileReader(file);
            String st;
            int i;
            int count=0;
            while ((i=fr.read()) != -1){
                output.append((char) i);
                count++;
            }
            System.out.println(output.toString().toUpperCase());
            System.out.println("\nLength of the file is "+count +" bytes");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
