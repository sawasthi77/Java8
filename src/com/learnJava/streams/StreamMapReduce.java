package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Optional;

public class StreamMapReduce {

    private static Optional<Integer> getAllNotebooks(){
        return StudentDatabase.getAllStudents()
                .stream().filter(student -> student.getGradLevel()> 2)
                .map(Student::getNotebooks)
                //.reduce((n1, n2) -> n1 + n2);
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        Optional<Integer> allNotebooks = getAllNotebooks();
        if(allNotebooks.isPresent()){
            System.out.println(String.format("Total number of notebooks with all students is %s" ,allNotebooks.get()));
        }
    }
}
