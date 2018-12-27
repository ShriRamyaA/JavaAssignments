package com.stackroute.pe3;

import java.util.Scanner;

public class ConsecutiveNumbers {

    private String numSeries;
    private String[] numSeriesArray;
    private int flag = 0;
    private int[] intNumbers;
    boolean isConsecutive;


    public boolean checkConsecutiveNumbers(int intNumbers[]) {

//        System.out.println("Please enter a series of seven numbers");
//        Scanner in = new Scanner(System.in);
//        numSeries = in.nextLine();
//        numSeriesArray = numSeries.split(" ");
//        intNumbers = new int[numSeriesArray.length];
//
//        for (int i = 0; i < intNumbers.length; i++) {
//            intNumbers[i] = Integer.parseInt(numSeriesArray[i]);
//        }


        for (int i = 1; i < intNumbers.length; i++) {
            if (intNumbers[i - 1] == intNumbers[i] + 1) {
                flag++;
            }
        }
        for (int i = 1; i < intNumbers.length; i++) {
            if (intNumbers[i - 1] == intNumbers[i] - 1) {
                flag++;
            }
        }


        for (int i = 0; i < intNumbers.length; i++) {
            System.out.print(intNumbers[i]+",");
        }
            if (flag == 6) {
                System.out.print(" are consecutive numbers");
                isConsecutive=true;
            } else {
                System.out.print(" are non-consecutive numbers");
                isConsecutive=false;
            }
            return isConsecutive;
        }

}

