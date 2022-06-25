package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /**
     * ClassName::MethodName
     */
    static Consumer<Student> c1 = System.out::println;
    /**
    * ClassName::InstanceMethodName
     */
    static Consumer<Student> c2 = Student::printActivities;
    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c2);
    }
}
