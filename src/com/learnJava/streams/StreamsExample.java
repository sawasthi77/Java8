package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = student -> student.getGradLevel() > 1 ;
        Predicate<Student> gpaPredicate = student -> student.getGpa() > 8.0 ;
        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .filter(studentPredicate)
                .filter(gpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
