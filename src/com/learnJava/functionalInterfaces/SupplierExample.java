package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> StudentDatabase.getAllStudents().get(0);
        Supplier<List<Student>> studentSupplierList = () -> StudentDatabase.getAllStudents();
        System.out.println(studentSupplierList.get());
    }
}
