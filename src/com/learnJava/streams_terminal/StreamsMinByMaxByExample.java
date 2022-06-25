package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {
    private static Optional<Student> minBy_Example(){
        return StudentDatabase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    private static Optional<Student> maxBy_Example(){
        return StudentDatabase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println(maxBy_Example());
    }
}
