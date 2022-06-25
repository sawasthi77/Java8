package com.learnJava.streams_terminal;

import com.learnJava.data.StudentDatabase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {
    private static long count(){
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 8).collect(counting());
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
