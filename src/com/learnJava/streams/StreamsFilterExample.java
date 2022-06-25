package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    private static Predicate<Student> femaleStudentsFiltering = (student) -> student.getGender()
            .equalsIgnoreCase("female");
    private static Predicate<Student> gpaStudentsFiltering = (student) -> student.getGpa() > 9.0;

    private static List<Student> filterStudents(){
        return StudentDatabase.getAllStudents().stream()
                .filter(femaleStudentsFiltering.and(gpaStudentsFiltering)).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
