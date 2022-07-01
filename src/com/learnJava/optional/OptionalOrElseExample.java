package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Optional;

public class OptionalOrElseExample {
    private static String OptionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student > studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    private static String OptionalOrElseGet(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student > studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    private static String OptionalOrElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student > studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available"));
        return name;
    }
    public static void main(String[] args) {
        //System.out.println(OptionalOrElse());
        //System.out.println(OptionalOrElseGet());
        System.out.println(OptionalOrElseThrow());
    }
}
