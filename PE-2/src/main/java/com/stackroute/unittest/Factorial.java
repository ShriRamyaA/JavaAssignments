package com.stackroute.unittest;

public class Factorial {
    public static void main(String[] args){
        long i=1;
        while(factorial(i)>=factorial(i-1)){
            System.out.println("Factorial of "+i+" is "+factorial(i));
            i++;
        }
        System.out.println("Factorial of "+i+" is out of range");

    }
    public static int factorial(int num){
        if(num==0||num==1)
            return 1;
        return num*factorial(num-1);
    }
    public static long factorial(long num){
        if(num==0||num==1)
            return 1;
        return num*factorial(num-1);
    }
}
