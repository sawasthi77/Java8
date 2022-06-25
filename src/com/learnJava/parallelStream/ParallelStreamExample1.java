package com.learnJava.parallelStream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    private static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time in Sequential "  + (endTime - startTime));
        return studentActivities;
    }

    private static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time in Parallel "  + (endTime - startTime));
        return studentActivities;
    }
    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
