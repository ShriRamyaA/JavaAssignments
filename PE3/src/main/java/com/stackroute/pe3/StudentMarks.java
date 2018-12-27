package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {

    private int numOfStudents;
    private int[] stuGrades;
    private boolean flag;

    public void acceptMarks(){

        System.out.println("Please enter the number of students");
        Scanner input=new Scanner(System.in);
        numOfStudents=input.nextInt();
        stuGrades=new int[numOfStudents];

        for (int i=0; i<numOfStudents; i++){
            do {
                flag=false;
                try {
                    System.out.println("Please enter the marks scored by student " + (i + 1));
                    Scanner marks = new Scanner(System.in);
                    stuGrades[i] = marks.nextInt();

                    if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                        throw new Exception("Exception for marks");
                    }
                } catch (Exception e){
                    System.out.println("Marks must be an integer value not less than 0 and not greater than 100");
                    flag=true;
                }
            }while (flag);

        }
    }
}
