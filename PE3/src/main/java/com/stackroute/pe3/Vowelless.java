package com.stackroute.pe3;

import java.util.Scanner;

public class Vowelless {

    private String[] places;
    private int size;
    private String[] placeVowelless;
    private StringBuilder tempPlace;

    public String eliminateVowels(){

        StringBuilder output=new StringBuilder();

        System.out.println("Please enter how many places you would like to enter");
        Scanner in=new Scanner(System.in);
        size=in.nextInt();

        places=new String[size];
        placeVowelless=new String[size];

        System.out.println("Please enter the places");
        Scanner place=new Scanner(System.in);
        for(int i=0; i<size;i++){
            places[i]=place.nextLine();
        }

        for (int i=0;i<size;i++){
            tempPlace=new StringBuilder();
            for(int j=0;j<places[i].length();j++){
                if(places[i].charAt(j)!='a' && places[i].charAt(j)!='e' &&
                        places[i].charAt(j)!='i' && places[i].charAt(j)!='o' &&
                        places[i].charAt(j)!='u'){
                    tempPlace.append(places[i].charAt(j));
                }
                placeVowelless[i]=tempPlace.toString();
            }
        }

        for(int i=0;i<placeVowelless.length;i++) {
            System.out.println("Place name without the vowel is :"+placeVowelless[i]);
            output.append(placeVowelless[i]+" ");
        }
        return output.toString();
    }
}
