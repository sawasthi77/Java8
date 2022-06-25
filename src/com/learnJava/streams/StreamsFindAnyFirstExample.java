package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    private static Optional<Student> findAnyStudent(){
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3)
                .findAny();
    }
    public static void main(String[] args) {
        Optional<Student> studentOptional = findAnyStudent();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
        else
        {
            System.out.println("Not found any student");
        }
    }
}
