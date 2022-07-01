package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    private static void OptionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 5).ifPresent(student -> System.out.println(student));
    }

    private static void OptionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if(studentOptional.isPresent()){
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    private static void OptionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if(studentOptional.isPresent()){
            Optional<String> bikeName = studentOptional.filter(student -> student.getGpa() >= 5)
                    .flatMap(Student::getBike).map(Bike::getName);
            bikeName.ifPresent(b -> System.out.println(b));
        }
    }
    public static void main(String[] args) {
        OptionalFlatMap();
    }
}
