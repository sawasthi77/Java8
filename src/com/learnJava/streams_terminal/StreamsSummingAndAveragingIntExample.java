package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import static java.util.stream.Collectors.*;

public class StreamsSummingAndAveragingIntExample {

    private static int sum(){
        return StudentDatabase.getAllStudents().stream().collect(summingInt(Student::getNotebooks));
    }

    private static double average(){
        return StudentDatabase.getAllStudents().stream().collect(averagingInt(Student::getNotebooks));
    }
    public static void main(String[] args) {
        System.out.println(average());
    }
}
