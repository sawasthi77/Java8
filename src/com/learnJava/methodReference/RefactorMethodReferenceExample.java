package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s ){
        return s.getGradLevel() > 1;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }
}
