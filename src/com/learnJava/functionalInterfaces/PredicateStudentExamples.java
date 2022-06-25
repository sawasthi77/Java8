package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudentExamples {
    static Predicate<Student> p1 = (student) -> student.getGradLevel() > 1;
    static Predicate<Student> p2 = (student) -> student.getGpa() > 8;
    static Consumer<Student> c1 = (student) -> System.out.println(student.getName());
    static List<Student> studentList = StudentDatabase.getAllStudents();
    private static void filterStudentByGradeLevel(){
        studentList.forEach(student -> {
            if(p1.test(student))
                c1.accept(student);
        });
    }
    private static void filterStudentByGPA(){
        studentList.forEach(student -> {
            if(p2.test(student))
                c1.accept(student);
        });
    }
    private static void filterByGradeAndGpa() {
        studentList.forEach(student -> {
            if(p1.and(p2).test(student))
                c1.accept(student);
        });
    }
    public static void main(String[] args) {
        filterByGradeAndGpa();
    }
}
