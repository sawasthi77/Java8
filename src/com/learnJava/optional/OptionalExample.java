package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {

    private static String getStudentName(){
        Student student = StudentDatabase.studentSupplier.get();
        if(student!=null) {
            return student.getName();
        }
        return null;
    }

    private static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        //Optional<Student> studentOptional = Optional.ofNullable(null);
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        return Optional.empty(); //Represents optional object with no value
    }
    public static void main(String[] args) {
        //System.out.println(getStudentName().length());
        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get().length());
        }
        else{
            System.out.println("Name not found");
        }
    }
}
