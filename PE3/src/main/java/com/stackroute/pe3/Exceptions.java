package com.stackroute.pe3;

public class Exceptions {

    private boolean exceptionOccured=false;

    public boolean createNegativeArraySizeException(){
        int arrSize = -8;
        try {
            int[] myArray = new int[arrSize];
        } catch (Exception e) {
            exceptionOccured=true;
            String message=e.getMessage();
            System.out.println("Negative Array Size Exception:"+message);
        }
        return exceptionOccured;
    }

    public boolean createIndexOutOfBoundException(){
        int[] numbers=new int[1];
        try{
            numbers[3]=3;
        }catch(Exception e){
            exceptionOccured=true;
            String message=e.getMessage();
            System.out.println("Index Out Of Bound Exception:"+message);
        }
        return exceptionOccured;
    }

    public boolean createNullPointerException(){
        StringBuilder word=null;
        try{
            word.toString();
        }catch (Exception e){
            exceptionOccured=true;
            String message=e.getMessage();
            System.out.println("Null pointer Exception:"+message);
        }
        return exceptionOccured;
    }
}
