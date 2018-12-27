package com.stackroute.pe3;

public class ChessBoardPattern {

    private String[][] pattern;
    private static final int BOARD_SIZE=8;
    private String color;

    public void createChessPattern(){

        pattern=new String[BOARD_SIZE][BOARD_SIZE];

        for (int i=0;i<BOARD_SIZE;i++){
            for(int j=0;j<BOARD_SIZE;j++){
                if((i+j)%2==0){
                    pattern[i][j]="WW|";
                }else
                    pattern[i][j]="BB|";
            }
        }

        for (int i = 0; i < BOARD_SIZE; i++)
        {
            for (int j = 0; j < BOARD_SIZE; j++)
                System.out.print(pattern[i][j]);
            System.out.println();
        }

    }
}
