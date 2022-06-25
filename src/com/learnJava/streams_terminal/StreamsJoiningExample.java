package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {
    private static String joining_1(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName).collect(joining());
    }

    private static String joining_2(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName).collect(joining(","));
    }

    private static String joining_3(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName).collect(joining(",","(",")"));
    }
    public static void main(String[] args) {
        System.out.println("Normal joining " + joining_1());
        System.out.println("Delimiter Joining " + joining_2());
        System.out.println("With prefix and suffix " + joining_3());
    }
}
