package com.stackroute.pe3;

public class TryCatchFinally {

    public static void main(String[] args){

        try{
//                int arrSize = -8;
//                int[] myArray = new int[arrSize];
                throw new Exception("Negative Array Size Exception");
            } catch (Exception e) {
            System.out.println(e.getMessage());
            }
            finally {
            System.out.println("I am in Finally block");
        }
    }
}
