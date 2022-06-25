package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    private static List<Student> sortStudentByName(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }

    private static List<Student> sortStudentByGPA(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
    }

    private static List<Student> sortStudentByGPADesc(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        // Sorting based on the students name
        System.out.println("Sorting students based on the name");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Sorting based on the gpa");
        sortStudentByGPA().forEach(System.out::println);

        System.out.println("Reverse Sorting on the basis of gpa");
        sortStudentByGPADesc().forEach(System.out::println);
    }
}
