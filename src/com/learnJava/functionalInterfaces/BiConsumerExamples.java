package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExamples {

    private static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + activities);
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + " b: " + b);
        biConsumer.accept("sam", "vam");

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiplication " + (a * b)  + " Division " + (a /b));
        multiply.accept(10,5);

        nameAndActivities();
    }
}
