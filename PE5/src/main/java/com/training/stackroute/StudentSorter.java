package com.training.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student studentOne, Student studentTwo) {

        // all comparison

        Integer valueOne=studentOne.getAge();
        Integer valueTwo=studentTwo.getAge();

        int compareAge = valueTwo
                .compareTo(valueOne);
        int compareName = studentOne.getName()
                .compareTo(studentTwo.getName());
        int compareId = studentOne.getId()
                .compareTo(studentTwo.getId());
        // 3-level comparison using if-else block
        if(compareAge == 0) {
            return ((compareName == 0) ? compareId : compareName);
        }
        else {
            return compareName;
        }
    }


}
