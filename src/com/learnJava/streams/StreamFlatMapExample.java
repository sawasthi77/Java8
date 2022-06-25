package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    private static List<String> studentActivities(){
        return  StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    private static long countOfActivities(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();
    }
    public static void main(String[] args) {
        System.out.println(studentActivities());
        System.out.println(countOfActivities());
    }
}
