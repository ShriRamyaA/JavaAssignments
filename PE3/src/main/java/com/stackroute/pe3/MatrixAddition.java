package com.stackroute.pe3;

import java.util.Scanner;

public class MatrixAddition {

    private int row;
    private int column;
    private int[][] matrixOne;
    private int[][] matrixTwo;
    private int[][] matrixSum;
    private int k=0;

    public void addMatrix(){


        System.out.println("Enter the number of rows in the matrix");
        Scanner in=new Scanner(System.in);
        row=in.nextInt();
        System.out.println("Enter the number of colum in the matrix");
        column=in.nextInt();
        matrixOne=new int[row][column];
        matrixTwo=new int[row][column];
        matrixSum=new int[row][column];

        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                matrixOne[i][j] = in.nextInt();

        System.out.println("Enter the elements of second matrix");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                matrixTwo[i][j] = in.nextInt();

        for (int i=0;i<row;i++){
            for (int j=0; j<column; j++){
                matrixSum[i][j]=matrixOne[i][j]+matrixTwo[i][j];
            }
        }

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
                System.out.print(matrixSum[i][j]+"\t");
            System.out.println();
        }

    }
}
