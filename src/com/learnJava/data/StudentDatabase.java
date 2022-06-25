package com.learnJava.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier =
            () -> new Student("Sam", 1, "female", 8.0, Arrays.asList("reading", "singing","swimming"));

    public static List<Student> getAllStudents(){
        Student student1 = new Student("Sam", 1, "female", 10.0, 11,Arrays.asList("reading", "singing","swimming"));
        Student student2 = new Student("Walter", 2, "male", 9.5, 12,Arrays.asList("meth making"));

        Student student3 = new Student("Adam", 3, "male", 5.0,13,  Arrays.asList("snooker", "football"));
        Student student4 = new Student("Sheryl", 1, "female", 4.0, 14,Arrays.asList("fantasy"));

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
        return studentList;
    }
}
