package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExamples {

    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDatabase.getAllStudents();

    private static void printStudents(){
        studentList.forEach(c1);
    }
    private static void printNamesAndActivities(){
        studentList.forEach(c2.andThen(c3)); // consumer chaining
    }

    private static void printNamesWithGradeGreaterThan1(){
        studentList.forEach(student -> {
            if(student.getGradLevel() > 1 && student.getGpa() > 8){
                c2.andThen(c3).accept(student);
            }
        });
    }
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        //c1.accept("sam");
        //printStudents();
        printNamesWithGradeGreaterThan1();
    }
}
