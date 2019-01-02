package com.stackroute.unittest;

        import java.io.BufferedReader;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.util.HashMap;
        import java.util.Map;

public class Frequency {
    public static void main(String[] args){
        HashMap<String,Integer> map = countWords("dmmy.txt");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }

    public static HashMap<String, Integer> countWords(String filename) {

        HashMap<String, Integer> wordCount = new HashMap();
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);

            String line = br.readLine();
            String outputLine =line;
            while(line!=null){
                line = br.readLine();
                outputLine += " "+line;
            }

            String[] words = outputLine.split(" ");
            for (int i = 0; i < words.length; i++) {
                if(words[i].matches("[a-zA-Z]+")){

                    if (wordCount.containsKey(words[i])) {
                        wordCount.put(words[i],wordCount.get(words[i])+1);
                    }
                    else {
                        wordCount.put(words[i], 1);
                    }
                }
            }
        }
        catch (FileNotFoundException fnfe) {
            System.err.println("File not found.");
        }
        catch (Exception e) {
            System.err.print(e);
        }

        return wordCount;
    }
}