package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {
    // this is different from the other grouping because it does not lose the values which do not satisfy the condition

    private static void partitioning_1(){
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 5;
        Map<Boolean, List<Student >> partitioningMap = StudentDatabase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println(partitioningMap);
    }

    private static void partitioning_2(){
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 5;
        Map<Boolean, Set<Student >> partitioningMap = StudentDatabase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate, toSet()));
        System.out.println(partitioningMap);
    }
    public static void main(String[] args) {
        partitioning_2();
    }
}
