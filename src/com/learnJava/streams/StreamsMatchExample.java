package com.learnJava.streams;

import com.learnJava.data.StudentDatabase;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class StreamsMatchExample {

    private static Boolean allMatch(){
        return StudentDatabase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() > 2.0);
    }

    private static Boolean anyMatch() {
        return StudentDatabase.getAllStudents().stream().anyMatch(student -> student.getGpa() > 4.0);
    }

    private static Boolean noneMatch(){
        return StudentDatabase.getAllStudents().stream().noneMatch(student -> student.getGpa() > 10);
    }
    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
        System.out.println(noneMatch());
    }
}
