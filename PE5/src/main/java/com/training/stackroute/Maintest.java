package com.training.stackroute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Maintest {

    public static void main(String[] args) {

        List<Student> listOfStudents = new ArrayList<Student>();
        Student studentObjOne = new Student("121", "Ramya", 22);
        Student studentObjTwo = new Student("122", "Surbhi", 22);
        Student studentObjThree = new Student("100", "Gayathri", 45);
        Student studentObjFour = new Student("119", "Ramya", 22);
        Student studentObjFive = new Student("99", "Ashok", 52);

        listOfStudents.add(studentObjOne);
        listOfStudents.add(studentObjTwo);
        listOfStudents.add(studentObjThree);
        listOfStudents.add(studentObjFour);
        listOfStudents.add(studentObjFive);

        Collections.sort(listOfStudents, new StudentSorter());

        // after Sorting: iterate using enhanced for-loop
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}
